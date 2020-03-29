package com.eliankurtev.closures

def log ={
    String type, Date createdOn, String msg ->
        println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug statement")

def debugLog = log.curry("Debug")
debugLog(new Date(), "This is another debug")
debugLog(new Date(), "This is one more")

def todayDebugLog = log.curry("Debug", new Date())
todayDebugLog("This is today's debug msg")

def crazyPersonLog = log.rcurry("Why am i logging this way")
crazyPersonLog("Error", new Date())

def typMsgLog = log.ncurry(1, new Date())
typMsgLog("Error", "This is using ncurry")
