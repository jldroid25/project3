class UsersController < ApplicationController
<<<<<<< HEAD
  
  def show
    @user = User.find(params[:id])
  end
  
  def show
     @title = @user.name
   end
  
  def new
    @title = "Sign up"
=======
 def new
   end
    
  def help
    @title ="Help"
>>>>>>> modeling-users
  end
  
  def new
    @title = "Sign up"
   end
   
    def show 
      @user = User.find(params[:id])
    end
    
    def new
      @title = "Sign up"
    end
  end
