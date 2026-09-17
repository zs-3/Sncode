package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgoc {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    /* synthetic */ zzgoc(java.util.Map r1, java.util.Map r2, com.google.android.gms.internal.ads.zzgob r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public static com.google.android.gms.internal.ads.zzgoa zza() {
            com.google.android.gms.internal.ads.zzgoa r0 = new com.google.android.gms.internal.ads.zzgoa
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public final java.lang.Enum zzb(java.lang.Object r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map r0 = r2.zzb
            java.lang.Object r0 = r0.get(r3)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unable to convert object enum: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    public final java.lang.Object zzc(java.lang.Enum r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L9
            return r0
        L9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unable to convert proto enum: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }
}
