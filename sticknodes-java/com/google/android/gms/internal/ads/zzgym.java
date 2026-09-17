package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgym implements com.google.android.gms.internal.ads.zzgyn {
    public zzgym() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final /* bridge */ /* synthetic */ java.lang.Object zza(java.lang.String r1, java.security.Provider r2) throws java.security.GeneralSecurityException {
            r0 = this;
            if (r2 != 0) goto L7
            java.security.Signature r1 = java.security.Signature.getInstance(r1)
            goto Lb
        L7:
            java.security.Signature r1 = java.security.Signature.getInstance(r1, r2)
        Lb:
            return r1
    }
}
