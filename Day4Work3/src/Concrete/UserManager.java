package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void signUp(User user) {
		System.out.println("Kayit oldundu. " + user.getEmail() + " Hosgeldiniz. ");

	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getEmail() + " Basariyla giris yaptiniz.");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail() + " Guncelleme islemleriniz basarili oldu.");
		System.out.println(" Kullanici bilgileriniz assagida gösterilmistir.");
		System.out.println("----------");
		System.out.println("Id: " + user.getId());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Password: " + user.getPassword());
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail()+" Silme islemi basarili.");

	}

}
