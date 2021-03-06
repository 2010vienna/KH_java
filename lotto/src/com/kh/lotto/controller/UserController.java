package com.kh.lotto.controller;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import com.kh.lotto.model.vo.User;
import com.kh.lotto.view.MainMenu;

public class UserController {
	private HashSet<User> users = new HashSet<User>();

	public void mainMenu() {
		MainMenu.mainMenu();
	}
	
	public void signUp() {
		Map<String, Object> hmap = MainMenu.signUpView();
		String originalPassword = (String)hmap.get("password");
		String strongPassword = "";

		try {
			//hash password
			strongPassword = UserController.generateStrongPasswordHash(originalPassword);
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}

		User user = new User((String)hmap.get("username"),
							 strongPassword,
							 (char)hmap.get("grade"),
							 (LocalDateTime)hmap.get("createdDate"),
							 (String)hmap.get("accountNumber"),
							 (int)hmap.get("userPoint"),
							 (int)hmap.get("userMoney"),
							 (boolean)hmap.get("loggedOn"),
							 (HashSet<String>)hmap.get("gambleRecord"));
		users.add(user);
	}

	public void signIn() {
		Map<String, String> map = MainMenu.signInView();
		String username = map.get("username");
		User user = search(username);
		if(user == null) {
			System.out.println("로그인 정보가 맞지 않습니다.");
			return;
		}
		if(user.isLoggedOn()) {
			System.out.println("이미 로그인된 유저입니다.");
			return;
		}
		String originalPassword = map.get("password");
		String storedPassword = user.getPassword();

		boolean loginSuccess = false;

		try {
			loginSuccess = validatePassword(originalPassword, storedPassword);
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		catch(InvalidKeySpecException e) {
			e.printStackTrace();
		}

		if(loginSuccess) {
			System.out.println("로그인이 성공적으로 되었습니다!");
			user.setLoggedOn(true);
		}
		else {
			System.out.println("로그인이 실패했습니다...");
			user.setLoggedOn(false);
		}
	}

	public void modify() {
		if(users.size() == 0) {
			System.out.println("유저가 없습니다.");
			return;
		}
		//수정할 유저 아이디
		String username = MainMenu.modifyView();

		/*NOT ALLOWED TO MODIFY
			//username
			//grade
			//date
			//userPoint
			//userMoney
			//gambleRecord
		*/

		//수정할 데이터
		User user = search(username);

		if(user == null) {
			System.out.println("존재하지 않는 유저입니다.");
		}
		else {
			//password
			System.out.print("비밀번호 : ");
			String password = MainMenu.CONSOLE.nextLine();
			try {
				//hash password
				password = UserController.generateStrongPasswordHash(password);
			}
			catch(NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			catch(InvalidKeySpecException e) {
				e.printStackTrace();
			}

			//accountNumber
			System.out.print("계좌번호 : ");
			String accountNumber = MainMenu.CONSOLE.nextLine();
			
			user.setPassword(password);
			user.setAccountNumber(accountNumber);
		}
	}

	public void delete() {
		if(users.size() == 0) {
			System.out.println("유저가 없습니다.");
			return;
		}
		String username = MainMenu.deleteView();

		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			if(username.equals(user.getUsername())) {
				itr.remove();
				System.out.println("데이터를 삭제하였습니다.");
				return;
			}
		}
		System.out.println("삭제하려는 데이터가 없습니다.");
	}


	public void search() {
		if(users.size() == 0) {
			System.out.println("유저가 없습니다.");
			return;
		}
		String username = MainMenu.searchView();
		User user = search(username);
		if(user == null) {
			System.out.println("유저가 없습니다.");
		}
		else {
			user.showUserInfo();
		}
	}

	public void searchAll() {
		if(users.size() == 0) {
			System.out.println("유저가 없습니다.");
			return;
		}
		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			user.showUserInfo();
		}
	}

	private User search(String username) {
		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			if(username.equals(user.getUsername()))
				return user;
		}
		return null;
	}
	
/* 비밀번호를 Hash알고리즘으로 암호화하기
 * PBKDF2WithHmacSHA1 알고리즘 사용
 * 참고사이트:
 * https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
 */
	private static String generateStrongPasswordHash(String password) 
			throws NoSuchAlgorithmException, InvalidKeySpecException{
		int iterations = 1000;
        char[] chars = password.toCharArray();
        byte[] salt = getSalt();
         
        PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = skf.generateSecret(spec).getEncoded();
        return iterations + ":" + toHex(salt) + ":" + toHex(hash);
	}

	private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }
     
    private static String toHex(byte[] array) throws NoSuchAlgorithmException {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);
        int paddingLength = (array.length * 2) - hex.length();
        if(paddingLength > 0)
        {
            return String.format("%0"  +paddingLength + "d", 0) + hex;
        }else{
            return hex;
        }
    }
    
/* 비밀번호 일치여부 확인
 * 참고사이트:
 * https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
 */
    private static boolean validatePassword(String originalPassword, String storedPassword) 
    		throws NoSuchAlgorithmException, InvalidKeySpecException
    {
        String[] parts = storedPassword.split(":");
        int iterations = Integer.parseInt(parts[0]);
        byte[] salt = fromHex(parts[1]);
        byte[] hash = fromHex(parts[2]);
         
        PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(), salt, iterations, hash.length * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] testHash = skf.generateSecret(spec).getEncoded();
         
        int diff = hash.length ^ testHash.length;
        for(int i = 0; i < hash.length && i < testHash.length; i++)
        {
            diff |= hash[i] ^ testHash[i];
        }
        return diff == 0;
    }

    private static byte[] fromHex(String hex) throws NoSuchAlgorithmException
    {
        byte[] bytes = new byte[hex.length() / 2];
        for(int i = 0; i<bytes.length ;i++)
        {
            bytes[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }


//		List<HashMap<String, String>> myArrList = new ArrayList<HashMap<String, String>>();
//		HashMap<String, String> map;
//
//		/*** Rows 1 ***/
//		map = new HashMap<String, String>();
//		map.put("CustomerID", "C001");
//		map.put("Name", "Ajay Kumar");
//		map.put("Email", "ajay@gmail.com");
//		map.put("CountryCode", "TH");
//		map.put("Budget", "1000000");
//		map.put("Used", "600000");
//		myArrList.add(map);
//
//		/*** Rows 2 ***/
//		map = new HashMap<String, String>();
//		map.put("CustomerID", "C002");
//		map.put("Name", "Rahul Kumar");
//		map.put("Email", "Rahul.kumar@gmail.com");
//		map.put("CountryCode", "UK");
//		map.put("Budget", "2000000");
//		map.put("Used", "800000");
//		myArrList.add(map);
//
//
//		File file = new File("d:\\sample.csv");
//		// Create a File and append if it already exists.
//		Writer writer = new FileWriter(file, true);
//		Reader reader = new FileReader(file);
//		//Copy List of Map Object into CSV format at specified File location.
//		csvWriter(myArrList, writer);
//		//Read CSV format from specified File location and print on console..
//		csvReader(reader);
//	}
    
	/**
	 * @param listOfMap
	 * @param writer
	 * @throws IOException
	 */
//	public static void csvWriter(List<HashMap<String, String>> listOfMap, Writer writer) throws IOException {
//		CsvSchema schema = null;
//		CsvSchema.Builder schemaBuilder = CsvSchema.builder();
//		if (listOfMap != null && !listOfMap.isEmpty()) {
//			for (String col : listOfMap.get(0).keySet()) {
//				schemaBuilder.addColumn(col);
//			}
//			schema = schemaBuilder.build().withLineSeparator("\r").withHeader();
//		}
//		CsvMapper mapper = new CsvMapper();
//		mapper.writer(schema).writeValues(writer).writeAll(listOfMap);
//		writer.flush();
//	}
//
//	/**
//	 * 
//	 * @param collection
//	 * @param writer
//	 * @param 
//	 * @throws IOException
//	 */
//	public static  void csvWriter(Collection collection, Writer writer) throws IOException {
//		if (collection != null && collection.size() > 0) {
//			CsvMapper mapper = new CsvMapper();
//			Object[] objects = collection.toArray();
//			Class type = objects[0].getClass();
//			CsvSchema schema = mapper.schemaFor(type).withHeader();
//			mapper.writer(schema).writeValues(writer).write(objects);
//		} else {
//			writer.write("No Data");
//		}
//		writer.flush();
//	}
//
//
//	/**
//	 * @param reader
//	 * @throws IOException
//	 */
//
//	public static void csvReader(Reader reader) throws IOException {
//		Iterator<Map<String, String>> iterator = new CsvMapper()
//				.readerFor(Map.class)
//				.with(CsvSchema.emptySchema().withHeader())
//				.readValues(reader);
//		while (iterator.hasNext()) {
//			Map<String, String> keyVals = iterator.next();
//			System.out.println(keyVals);
//		}
//	}

	public HashSet<User> getUsers() { return users; }
}
