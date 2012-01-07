require 'test_helper'

class WarbypostsControllerTest < ActionController::TestCase
  setup do
    @warbypost = warbyposts(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:warbyposts)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create warbypost" do
    assert_difference('Warbypost.count') do
      post :create, :warbypost => @warbypost.attributes
    end

    assert_redirected_to warbypost_path(assigns(:warbypost))
  end

  test "should show warbypost" do
    get :show, :id => @warbypost.to_param
    assert_response :success
  end

  test "should get edit" do
    get :edit, :id => @warbypost.to_param
    assert_response :success
  end

  test "should update warbypost" do
    put :update, :id => @warbypost.to_param, :warbypost => @warbypost.attributes
    assert_redirected_to warbypost_path(assigns(:warbypost))
  end

  test "should destroy warbypost" do
    assert_difference('Warbypost.count', -1) do
      delete :destroy, :id => @warbypost.to_param
    end

    assert_redirected_to warbyposts_path
  end
end
