require 'test_helper'

class LayoutLinksTest < ActionDispatch::IntegrationTest
  fixtures :all
  
    it "should have a Home page at '/'" do
      get '/'
      response.should have_selector ('title', :content => "Home")
    end
    
    "should have a home Contact page at '/content'" do
      get '/content'
      response.should have_selector ('title', :content => "contact")
    end
    
     "should have an About page at '/about'" do
       get '/about'
       response.should have_selector ('title', :content => "About")
     end
     
     "should have a Help page at '/help'" do
       get '/help'
       response.should have_selector ('title', :content => "Help")
     end
    
    it "should have a sign up page at ' /signup'" do
      get '/signup'
      response.shoould have_selector('title', :content => "Sign up")
    end
      
    
end
