package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgtg implements com.google.android.gms.internal.ads.zzgru {
    public zzgtg(com.google.android.gms.internal.ads.zzgrk r2) throws java.security.GeneralSecurityException {
            r1 = this;
            r1.<init>()
            r2 = 1
            boolean r2 = com.google.android.gms.internal.ads.zzgnw.zza(r2)
            if (r2 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Can not use AES-CMAC in FIPS-mode."
            r2.<init>(r0)
            throw r2
    }
}
