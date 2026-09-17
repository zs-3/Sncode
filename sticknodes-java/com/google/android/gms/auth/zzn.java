package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
enum zzn extends java.lang.Enum {
    public static final com.google.android.gms.auth.zzn zza = null;
    public static final com.google.android.gms.auth.zzn zzb = null;
    public static final com.google.android.gms.auth.zzn zzc = null;
    private static final /* synthetic */ com.google.android.gms.auth.zzn[] zzd = null;

    static {
            com.google.android.gms.auth.zzn r0 = new com.google.android.gms.auth.zzn
            java.lang.String r1 = "LEGACY"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.auth.zzn.zza = r0
            com.google.android.gms.auth.zzn r1 = new com.google.android.gms.auth.zzn
            java.lang.String r3 = "AUTH_INSTANTIATION"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.android.gms.auth.zzn.zzb = r1
            com.google.android.gms.auth.zzn r3 = new com.google.android.gms.auth.zzn
            java.lang.String r5 = "CALLER_INSTANTIATION"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.android.gms.auth.zzn.zzc = r3
            r5 = 3
            com.google.android.gms.auth.zzn[] r5 = new com.google.android.gms.auth.zzn[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.auth.zzn.zzd = r5
            return
    }

    zzn(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.gms.auth.zzn[] values() {
            com.google.android.gms.auth.zzn[] r0 = com.google.android.gms.auth.zzn.zzd
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.auth.zzn[] r0 = (com.google.android.gms.auth.zzn[]) r0
            return r0
    }
}
