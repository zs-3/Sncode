package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidNet implements com.badlogic.gdx.Net {
    final com.badlogic.gdx.backends.android.AndroidApplicationBase app;
    com.badlogic.gdx.net.NetJavaImpl netJavaImpl;

    public AndroidNet(com.badlogic.gdx.backends.android.AndroidApplicationBase r1, com.badlogic.gdx.backends.android.AndroidApplicationConfiguration r2) {
            r0 = this;
            r0.<init>()
            r0.app = r1
            com.badlogic.gdx.net.NetJavaImpl r1 = new com.badlogic.gdx.net.NetJavaImpl
            int r2 = r2.maxNetThreads
            r1.<init>(r2)
            r0.netJavaImpl = r1
            return
    }

    public void cancelHttpRequest(com.badlogic.gdx.Net.HttpRequest r2) {
            r1 = this;
            com.badlogic.gdx.net.NetJavaImpl r0 = r1.netJavaImpl
            r0.cancelHttpRequest(r2)
            return
    }

    public com.badlogic.gdx.net.Socket newClientSocket(com.badlogic.gdx.Net.Protocol r2, java.lang.String r3, int r4, com.badlogic.gdx.net.SocketHints r5) {
            r1 = this;
            com.badlogic.gdx.net.NetJavaSocketImpl r0 = new com.badlogic.gdx.net.NetJavaSocketImpl
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public com.badlogic.gdx.net.ServerSocket newServerSocket(com.badlogic.gdx.Net.Protocol r2, int r3, com.badlogic.gdx.net.ServerSocketHints r4) {
            r1 = this;
            com.badlogic.gdx.net.NetJavaServerSocketImpl r0 = new com.badlogic.gdx.net.NetJavaServerSocketImpl
            r0.<init>(r2, r3, r4)
            return r0
    }

    public com.badlogic.gdx.net.ServerSocket newServerSocket(com.badlogic.gdx.Net.Protocol r2, java.lang.String r3, int r4, com.badlogic.gdx.net.ServerSocketHints r5) {
            r1 = this;
            com.badlogic.gdx.net.NetJavaServerSocketImpl r0 = new com.badlogic.gdx.net.NetJavaServerSocketImpl
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // com.badlogic.gdx.Net
    public boolean openURI(java.lang.String r3) {
            r2 = this;
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r0 = new android.content.Intent     // Catch: android.content.ActivityNotFoundException -> L21
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)     // Catch: android.content.ActivityNotFoundException -> L21
            com.badlogic.gdx.backends.android.AndroidApplicationBase r3 = r2.app     // Catch: android.content.ActivityNotFoundException -> L21
            android.content.Context r3 = r3.getContext()     // Catch: android.content.ActivityNotFoundException -> L21
            boolean r3 = r3 instanceof android.app.Activity     // Catch: android.content.ActivityNotFoundException -> L21
            if (r3 != 0) goto L1a
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r3)     // Catch: android.content.ActivityNotFoundException -> L21
        L1a:
            com.badlogic.gdx.backends.android.AndroidApplicationBase r3 = r2.app     // Catch: android.content.ActivityNotFoundException -> L21
            r3.startActivity(r0)     // Catch: android.content.ActivityNotFoundException -> L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    public void sendHttpRequest(com.badlogic.gdx.Net.HttpRequest r2, com.badlogic.gdx.Net.HttpResponseListener r3) {
            r1 = this;
            com.badlogic.gdx.net.NetJavaImpl r0 = r1.netJavaImpl
            r0.sendHttpRequest(r2, r3)
            return
    }
}
