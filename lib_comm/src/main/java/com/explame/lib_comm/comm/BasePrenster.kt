package com.example.Wandroid.mvp.comm

/**
 *Copyright (C), 2015-2020, XXX有限公司
 * @ClassName: Test
 * @Description: java类作用描述
 * @Author: xueliang
 * @Date: 2020/11/8 0008 21:21
 *Description:
 *博客地址：https://blog.csdn.net/xueshao110?spm=1010.2135.3001.5113
 */
open class BasePrenster<V> {

    protected var mView:V?=null;
    open fun bindView(mbaseView:V){
        mView=mbaseView;
    }

    fun unbindView() {
        this.mView = null;
    }

    fun getBaseView()=mView;
}