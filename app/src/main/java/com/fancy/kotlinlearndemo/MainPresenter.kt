package com.fancy.kotlinlearndemo

import com.fancy.kotlinlearndemo.define_class.IMain

/**
 * Created by Fancy on 2017/6/16.
 */
//代理模式 by的用法
class MainPresenter(iview : IMain) : IMain by iview{

}
