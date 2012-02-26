class User < ActiveRecord::Base
  attr_accessible :name, :email
  
  email_regex = /\A[\w+\-.]+@[a-z\d\-.]+\.[a-z]+\z/i
  
  validates :name, :presence => true,
                   :length => { :maximum => 50}
  validates :email, :presence =>  true,
                    :format => { :with => email_regex },
                    :uniqueness => { :case_sensitive => false }
end

# == Schema Information
#
# Table name: users
#
#  id         :integer         not null, primary key
#  name       :string(255)
#  email      :string(255)
#  created_at :datetime
#  updated_at :datetime
#
class User < ActiveRecord::Base
  attr_accessible :name, :email
  
  validates :name, :presence => true
end

class User < ActiveRecord::Base
  attr_accessor :password
  attr_accessible :name, :email, :password, :password_confirmation
  
  #create the virtual attribute 'Password_confirmation'.
  validates :password, :presence => true,
                       :confirmation => true,
                       :length => { :within => 6..40 }
                       
  before_save :encrypted_password 

  def has_password?(submitted_password)
    encrypted_password == encrypt(submitted_password)
  end
  
  def self.authenticate(email, submitted_password)
    user =find_by_email(email)
    return nil if user.nill?
    return user if user.has_password?(submitted_password)
  end
  
  private
  
  def encrypted_password
    self.salt = make_salt if new_record?
    self.encrypted_password = encrypt(password)
    end
    
    def encrypt(string)
     secure_hash("#{salt}--#{string}")
      end
      
      def make_salt
        secure_hash("#{Time.now.utc}--#{password}")
        end
        
        def secure_hash(string)
          Digest::SHA2.hexdigest(string)
          end                    
end                       