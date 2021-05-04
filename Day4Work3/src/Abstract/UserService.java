package Abstract;

import Entities.User;

public interface UserService {

	void signUp(User user);

	void signIn(User user);

	void update(User user);

	void delete(User user);

}
