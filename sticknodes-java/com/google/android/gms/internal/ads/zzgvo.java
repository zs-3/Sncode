package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public enum zzgvo extends java.lang.Enum implements com.google.android.gms.internal.ads.zzhbi {
    public static final com.google.android.gms.internal.ads.zzgvo zza = null;
    public static final com.google.android.gms.internal.ads.zzgvo zzb = null;
    public static final com.google.android.gms.internal.ads.zzgvo zzc = null;
    public static final com.google.android.gms.internal.ads.zzgvo zzd = null;
    public static final com.google.android.gms.internal.ads.zzgvo zze = null;
    public static final com.google.android.gms.internal.ads.zzgvo zzf = null;
    public static final com.google.android.gms.internal.ads.zzgvo zzg = null;
    private static final /* synthetic */ com.google.android.gms.internal.ads.zzgvo[] zzh = null;
    private final int zzi;

    static {
            com.google.android.gms.internal.ads.zzgvo r0 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r1 = "UNKNOWN_HASH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.android.gms.internal.ads.zzgvo.zza = r0
            com.google.android.gms.internal.ads.zzgvo r1 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r3 = "SHA1"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.android.gms.internal.ads.zzgvo.zzb = r1
            com.google.android.gms.internal.ads.zzgvo r3 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r5 = "SHA384"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.google.android.gms.internal.ads.zzgvo.zzc = r3
            com.google.android.gms.internal.ads.zzgvo r5 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r7 = "SHA256"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.google.android.gms.internal.ads.zzgvo.zzd = r5
            com.google.android.gms.internal.ads.zzgvo r7 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r9 = "SHA512"
            r10 = 4
            r7.<init>(r9, r10, r10)
            com.google.android.gms.internal.ads.zzgvo.zze = r7
            com.google.android.gms.internal.ads.zzgvo r9 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r11 = "SHA224"
            r12 = 5
            r9.<init>(r11, r12, r12)
            com.google.android.gms.internal.ads.zzgvo.zzf = r9
            com.google.android.gms.internal.ads.zzgvo r11 = new com.google.android.gms.internal.ads.zzgvo
            java.lang.String r13 = "UNRECOGNIZED"
            r14 = 6
            r15 = -1
            r11.<init>(r13, r14, r15)
            com.google.android.gms.internal.ads.zzgvo.zzg = r11
            r13 = 7
            com.google.android.gms.internal.ads.zzgvo[] r13 = new com.google.android.gms.internal.ads.zzgvo[r13]
            r13[r2] = r0
            r13[r4] = r1
            r13[r6] = r3
            r13[r8] = r5
            r13[r10] = r7
            r13[r12] = r9
            r13[r14] = r11
            com.google.android.gms.internal.ads.zzgvo.zzh = r13
            return
    }

    zzgvo(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzi = r3
            return
    }

    public static com.google.android.gms.internal.ads.zzgvo[] values() {
            com.google.android.gms.internal.ads.zzgvo[] r0 = com.google.android.gms.internal.ads.zzgvo.zzh
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.internal.ads.zzgvo[] r0 = (com.google.android.gms.internal.ads.zzgvo[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.zza()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final int zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgvo r0 = com.google.android.gms.internal.ads.zzgvo.zzg
            if (r2 == r0) goto L7
            int r0 = r2.zzi
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
