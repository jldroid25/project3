#by using the symbol ':user', We get factory Girl to simulate the User model.
Factory.define :user do |user|
  user.name         "James Lemaire"
  user.email        "jamesbong12@gmail.com"
  user.password     "foobar"
  user.password_confirmation "foobar"
end