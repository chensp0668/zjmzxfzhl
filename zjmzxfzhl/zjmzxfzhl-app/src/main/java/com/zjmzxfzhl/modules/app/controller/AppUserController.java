package com.zjmzxfzhl.modules.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjmzxfzhl.common.core.base.BaseController;

/**
 * 用户Controller
 * 
 * @author 庄金明
 */
@RestController
@RequestMapping("/app")
public class AppUserController extends BaseController {

    // @GetMapping("/getUserInfo")
    // public Result getUserInfo(@RequestAttribute(AppConstants.APP_SESSION_OBJECT) AppSessionObject appSessionObject) {
    // return Result.ok(appSessionObject);
    // }
    //
    // @GetMapping("/getUserId")
    // public Result getUserId(@RequestAttribute(AppConstants.APP_SESSION_OBJECT) AppSessionObject appSessionObject) {
    // String userId = null;
    // if (appSessionObject != null) {
    // userId = appSessionObject.getUserId();
    // }
    // return Result.ok(null, userId);
    // }
}
