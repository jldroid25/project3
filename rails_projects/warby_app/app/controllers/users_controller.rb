class UsersController < ApplicationController
  def new
  end
  
  def help
    @title ="Help"
  end
  
  def new
    @title = "Sign up"
    
    def show 
      @user = User.find(params[:id])
    end
    
    def new
      @title = "Sign up"
    
  end

end
