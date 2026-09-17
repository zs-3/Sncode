package com.badlogic.gdx.net;

/* loaded from: classes.dex */
public class NetJavaServerSocketImpl implements com.badlogic.gdx.net.ServerSocket {
    private com.badlogic.gdx.Net.Protocol protocol;
    private java.net.ServerSocket server;

    public NetJavaServerSocketImpl(com.badlogic.gdx.Net.Protocol r2, int r3, com.badlogic.gdx.net.ServerSocketHints r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public NetJavaServerSocketImpl(com.badlogic.gdx.Net.Protocol r2, java.lang.String r3, int r4, com.badlogic.gdx.net.ServerSocketHints r5) {
            r1 = this;
            r1.<init>()
            r1.protocol = r2
            java.net.ServerSocket r2 = new java.net.ServerSocket     // Catch: java.lang.Exception -> L1f
            r2.<init>()     // Catch: java.lang.Exception -> L1f
            r1.server = r2     // Catch: java.lang.Exception -> L1f
            if (r3 == 0) goto L14
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> L1f
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> L1f
            goto L19
        L14:
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.lang.Exception -> L1f
            r2.<init>(r4)     // Catch: java.lang.Exception -> L1f
        L19:
            java.net.ServerSocket r3 = r1.server     // Catch: java.lang.Exception -> L1f
            r3.bind(r2)     // Catch: java.lang.Exception -> L1f
            return
        L1f:
            r2 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Cannot create a server socket at port "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = "."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            java.net.ServerSocket r0 = r3.server
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.lang.Exception -> Lb
            r0 = 0
            r3.server = r0     // Catch: java.lang.Exception -> Lb
            goto L14
        Lb:
            r0 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r1 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r2 = "Error closing server."
            r1.<init>(r2, r0)
            throw r1
        L14:
            return
    }
}
