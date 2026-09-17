package com.badlogic.gdx.net;

/* loaded from: classes.dex */
public class NetJavaSocketImpl implements com.badlogic.gdx.net.Socket {
    private java.net.Socket socket;

    public NetJavaSocketImpl(com.badlogic.gdx.Net.Protocol r3, java.lang.String r4, int r5, com.badlogic.gdx.net.SocketHints r6) {
            r2 = this;
            r2.<init>()
            java.net.Socket r3 = new java.net.Socket     // Catch: java.lang.Exception -> L18
            r3.<init>()     // Catch: java.lang.Exception -> L18
            r2.socket = r3     // Catch: java.lang.Exception -> L18
            r2.applyHints(r6)     // Catch: java.lang.Exception -> L18
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> L18
            r3.<init>(r4, r5)     // Catch: java.lang.Exception -> L18
            java.net.Socket r6 = r2.socket     // Catch: java.lang.Exception -> L18
            r6.connect(r3)     // Catch: java.lang.Exception -> L18
            return
        L18:
            r3 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r6 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error making a socket connection to "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ":"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4, r3)
            throw r6
    }

    private void applyHints(com.badlogic.gdx.net.SocketHints r1) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            java.net.Socket r0 = r3.socket
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.lang.Exception -> Lb
            r0 = 0
            r3.socket = r0     // Catch: java.lang.Exception -> Lb
            goto L14
        Lb:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Error closing socket."
            r1.<init>(r2, r0)
            throw r1
        L14:
            return
    }
}
