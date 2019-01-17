package org.yangxin.aigou.util;


//Ajax请求响应对象的类
public class AjaxResult {
    private boolean success = true;
    private String message = "操作成功！";

    private Object resultobj;

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResultobj() {
        return resultobj;
    }

    public AjaxResult setResultobj(Object resultobj) {
        this.resultobj = resultobj;
        return this;
    }

    //直接通过AjaxResult.me直接使用  （成功）
    //AjaxResult.me().setMessage()成功
    //AjaxResult.me().setSuccess(false),setMessage("失败");
    public static AjaxResult me(){
        return new AjaxResult();
    }
    /*
    //成功
    public AjaxResult() {
    }
    //失败，并且有提示
    public AjaxResult(String message) {
        this.success = false;
        this.message = message;
    }*/
}
