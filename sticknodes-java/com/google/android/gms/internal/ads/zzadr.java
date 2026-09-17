package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadr {
    private final com.google.android.gms.internal.ads.zzek zza;

    public zzadr() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r1 = 10
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzbk zza(com.google.android.gms.internal.ads.zzadc r8, com.google.android.gms.internal.ads.zzags r9) throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            com.google.android.gms.internal.ads.zzek r3 = r7.zza     // Catch: java.io.EOFException -> L4c
            byte[] r3 = r3.zzN()     // Catch: java.io.EOFException -> L4c
            r4 = 10
            r8.zzh(r3, r0, r4)     // Catch: java.io.EOFException -> L4c
            com.google.android.gms.internal.ads.zzek r3 = r7.zza
            r3.zzL(r0)
            com.google.android.gms.internal.ads.zzek r3 = r7.zza
            int r3 = r3.zzo()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r3 == r5) goto L1f
            goto L4c
        L1f:
            com.google.android.gms.internal.ads.zzek r3 = r7.zza
            r5 = 3
            r3.zzM(r5)
            com.google.android.gms.internal.ads.zzek r3 = r7.zza
            int r3 = r3.zzl()
            int r5 = r3 + 10
            if (r1 != 0) goto L47
            byte[] r1 = new byte[r5]
            com.google.android.gms.internal.ads.zzek r6 = r7.zza
            byte[] r6 = r6.zzN()
            java.lang.System.arraycopy(r6, r0, r1, r0, r4)
            r8.zzh(r1, r4, r3)
            com.google.android.gms.internal.ads.zzafw r3 = new com.google.android.gms.internal.ads.zzafw
            r3.<init>()
            com.google.android.gms.internal.ads.zzbk r1 = com.google.android.gms.internal.ads.zzagu.zza(r1, r5, r9, r3)
            goto L4a
        L47:
            r8.zzg(r3)
        L4a:
            int r2 = r2 + r5
            goto L3
        L4c:
            r8.zzj()
            r8.zzg(r2)
            return r1
    }
}
