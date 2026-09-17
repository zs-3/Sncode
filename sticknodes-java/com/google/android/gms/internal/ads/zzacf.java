package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzacf {
    public final java.util.List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final java.lang.String zzl;

    private zzacf(java.util.List r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, float r11, java.lang.String r12) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            r0.zzk = r11
            r0.zzl = r12
            return
    }

    public static com.google.android.gms.internal.ads.zzacf zza(com.google.android.gms.internal.ads.zzek r15) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 4
            r15.zzM(r0)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r0 = r15.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r1 = 3
            r0 = r0 & r1
            int r4 = r0 + 1
            if (r4 == r1) goto L91
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r3.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r0 = r15.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r0 = r0 & 31
            r1 = 0
            r2 = 0
        L1b:
            if (r2 >= r0) goto L27
            byte[] r5 = zzb(r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r3.add(r5)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r2 = r2 + 1
            goto L1b
        L27:
            int r2 = r15.zzm()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r5 = 0
        L2c:
            if (r5 >= r2) goto L38
            byte[] r6 = zzb(r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r3.add(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r5 = r5 + 1
            goto L2c
        L38:
            r15 = -1
            if (r0 <= 0) goto L79
            java.lang.Object r15 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            byte[] r15 = (byte[]) r15     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            byte[] r0 = (byte[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r15 = r15.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r1 = r4 + 1
            com.google.android.gms.internal.ads.zzfr r15 = com.google.android.gms.internal.ads.zzfs.zzf(r0, r1, r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r0 = r15.zze     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r1 = r15.zzf     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r2 = r15.zzh     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r2 = r2 + 8
            int r5 = r15.zzi     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r5 = r5 + 8
            int r6 = r15.zzj     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r7 = r15.zzk     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r8 = r15.zzl     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r9 = r15.zzm     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            float r10 = r15.zzg     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r11 = r15.zza     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r12 = r15.zzb     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            int r15 = r15.zzc     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            java.lang.String r15 = com.google.android.gms.internal.ads.zzdk.zza(r11, r12, r15)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r14 = r15
            r11 = r8
            r12 = r9
            r13 = r10
            r8 = r5
            r9 = r6
            r10 = r7
            r5 = r0
            r6 = r1
            r7 = r2
            goto L8a
        L79:
            r0 = 16
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r14 = r1
            r5 = -1
            r6 = -1
            r7 = -1
            r8 = -1
            r9 = -1
            r10 = -1
            r11 = -1
            r12 = 16
            r13 = 1065353216(0x3f800000, float:1.0)
        L8a:
            com.google.android.gms.internal.ads.zzacf r15 = new com.google.android.gms.internal.ads.zzacf     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            return r15
        L91:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            r15.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
            throw r15     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L97
        L97:
            r15 = move-exception
            java.lang.String r0 = "Error parsing AVC config"
            com.google.android.gms.internal.ads.zzbo r15 = com.google.android.gms.internal.ads.zzbo.zza(r0, r15)
            throw r15
    }

    private static byte[] zzb(com.google.android.gms.internal.ads.zzek r2) {
            int r0 = r2.zzq()
            int r1 = r2.zzd()
            r2.zzM(r0)
            byte[] r2 = r2.zzN()
            byte[] r2 = com.google.android.gms.internal.ads.zzdk.zzc(r2, r1, r0)
            return r2
    }
}
