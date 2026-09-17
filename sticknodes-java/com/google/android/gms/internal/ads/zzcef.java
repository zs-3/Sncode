package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcef extends javax.net.ssl.SSLSocketFactory {
    final javax.net.ssl.SSLSocketFactory zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzceg zzb;

    zzcef(com.google.android.gms.internal.ads.zzceg r1) {
            r0 = this;
            r0.zzb = r1
            r0.<init>()
            javax.net.SocketFactory r1 = javax.net.ssl.SSLSocketFactory.getDefault()
            javax.net.ssl.SSLSocketFactory r1 = (javax.net.ssl.SSLSocketFactory) r1
            r0.zza = r1
            return
    }

    private final java.net.Socket zza(java.net.Socket r3) throws java.net.SocketException {
            r2 = this;
            com.google.android.gms.internal.ads.zzceg r0 = r2.zzb
            int r1 = com.google.android.gms.internal.ads.zzceg.zzk(r0)
            if (r1 <= 0) goto Lf
            int r0 = com.google.android.gms.internal.ads.zzceg.zzk(r0)
            r3.setReceiveBufferSize(r0)
        Lf:
            com.google.android.gms.internal.ads.zzceg r0 = r2.zzb
            com.google.android.gms.internal.ads.zzceg.zzl(r0, r3)
            return r3
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.net.Socket r2 = r0.createSocket(r2, r3)
            r1.zza(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            r1.zza(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.net.Socket r2 = r0.createSocket(r2, r3)
            r1.zza(r2)
            return r2
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress r2, int r3, java.net.InetAddress r4, int r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            r1.zza(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket r2, java.lang.String r3, int r4, boolean r5) throws java.io.IOException {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.net.Socket r2 = r0.createSocket(r2, r3, r4, r5)
            r1.zza(r2)
            return r2
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.lang.String[] r0 = r0.getDefaultCipherSuites()
            return r0
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
            r1 = this;
            javax.net.ssl.SSLSocketFactory r0 = r1.zza
            java.lang.String[] r0 = r0.getSupportedCipherSuites()
            return r0
    }
}
