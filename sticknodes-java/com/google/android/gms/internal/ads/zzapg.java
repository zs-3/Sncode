package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzapg extends com.google.android.gms.internal.ads.zzaph {
    private final byte[] zza;

    public zzapg(java.security.cert.X509Certificate r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaph, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }
}
