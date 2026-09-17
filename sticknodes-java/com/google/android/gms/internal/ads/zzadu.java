package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzadu {
    private static final java.lang.String[] zza = null;
    private static final int[] zzb = null;
    private static final int[] zzc = null;
    private static final int[] zzd = null;
    private static final int[] zze = null;
    private static final int[] zzf = null;
    private static final int[] zzg = null;

    static {
            java.lang.String r0 = "audio/mpeg-L1"
            java.lang.String r1 = "audio/mpeg-L2"
            java.lang.String r2 = "audio/mpeg"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.internal.ads.zzadu.zza = r0
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [44100, 48000, 32000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zzb = r0
            r0 = 14
            int[] r1 = new int[r0]
            r1 = {x0044: FILL_ARRAY_DATA , data: [32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zzc = r1
            int[] r1 = new int[r0]
            r1 = {x0064: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zzd = r1
            int[] r1 = new int[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zze = r1
            int[] r1 = new int[r0]
            r1 = {x00a4: FILL_ARRAY_DATA , data: [32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zzf = r1
            int[] r0 = new int[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000} // fill-array
            com.google.android.gms.internal.ads.zzadu.zzg = r0
            return
    }

    static /* bridge */ /* synthetic */ int zza(int r0, int r1) {
            int r0 = zzl(r0, r1)
            return r0
    }

    public static int zzb(int r7) {
            boolean r0 = zzm(r7)
            r1 = -1
            if (r0 != 0) goto L8
            goto L6c
        L8:
            int r0 = r7 >>> 19
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            if (r0 == r3) goto L6c
            int r4 = r7 >>> 17
            r4 = r4 & r2
            if (r4 == 0) goto L6c
            int r5 = r7 >>> 12
            r6 = 15
            r5 = r5 & r6
            if (r5 == 0) goto L6c
            if (r5 == r6) goto L6c
            int r6 = r7 >>> 10
            r6 = r6 & r2
            if (r6 == r2) goto L6c
            int r5 = r5 + r1
            int[] r1 = com.google.android.gms.internal.ads.zzadu.zzb
            r1 = r1[r6]
            r6 = 2
            if (r0 != r6) goto L2d
            int r1 = r1 / 2
            goto L31
        L2d:
            if (r0 != 0) goto L31
            int r1 = r1 / 4
        L31:
            int r7 = r7 >>> 9
            r7 = r7 & r3
            if (r4 != r2) goto L48
            if (r0 != r2) goto L3d
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzc
            r0 = r0[r5]
            goto L41
        L3d:
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzd
            r0 = r0[r5]
        L41:
            int r0 = r0 * 12
            int r0 = r0 / r1
            int r0 = r0 + r7
            int r0 = r0 * 4
            return r0
        L48:
            if (r0 != r2) goto L56
            if (r4 != r6) goto L51
            int[] r6 = com.google.android.gms.internal.ads.zzadu.zze
            r5 = r6[r5]
            goto L5a
        L51:
            int[] r6 = com.google.android.gms.internal.ads.zzadu.zzf
            r5 = r6[r5]
            goto L5a
        L56:
            int[] r6 = com.google.android.gms.internal.ads.zzadu.zzg
            r5 = r6[r5]
        L5a:
            r6 = 144(0x90, float:2.02E-43)
            if (r0 != r2) goto L63
            int r5 = r5 * 144
            int r5 = r5 / r1
            int r5 = r5 + r7
            return r5
        L63:
            if (r4 != r3) goto L67
            r6 = 72
        L67:
            int r6 = r6 * r5
            int r6 = r6 / r1
            int r6 = r6 + r7
            return r6
        L6c:
            return r1
    }

    public static int zzc(int r5) {
            boolean r0 = zzm(r5)
            if (r0 != 0) goto L7
            goto L26
        L7:
            int r0 = r5 >>> 19
            r1 = 3
            r0 = r0 & r1
            r2 = 1
            if (r0 == r2) goto L26
            int r2 = r5 >>> 17
            r2 = r2 & r1
            if (r2 == 0) goto L26
            int r3 = r5 >>> 12
            int r5 = r5 >>> 10
            r5 = r5 & r1
            r4 = 15
            r3 = r3 & r4
            if (r3 == 0) goto L26
            if (r3 == r4) goto L26
            if (r5 == r1) goto L26
            int r5 = zzl(r0, r2)
            return r5
        L26:
            r5 = -1
            return r5
    }

    static /* bridge */ /* synthetic */ boolean zzd(int r0) {
            boolean r0 = zzm(r0)
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zze() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzf() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zze
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzg() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzh() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzi() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ int[] zzj() {
            int[] r0 = com.google.android.gms.internal.ads.zzadu.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String[] zzk() {
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzadu.zza
            return r0
    }

    private static int zzl(int r2, int r3) {
            r0 = 1
            r1 = 1152(0x480, float:1.614E-42)
            if (r3 == r0) goto Lc
            r2 = 2
            if (r3 == r2) goto Lb
            r2 = 384(0x180, float:5.38E-43)
            return r2
        Lb:
            return r1
        Lc:
            r3 = 3
            if (r2 != r3) goto L10
            return r1
        L10:
            r2 = 576(0x240, float:8.07E-43)
            return r2
    }

    private static boolean zzm(int r1) {
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r1 = r1 & r0
            if (r1 != r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }
}
