package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = null;
    private static final int[] zzc = null;

    static {
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350} // fill-array
            com.google.android.gms.internal.ads.zzaby.zzb = r0
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1} // fill-array
            com.google.android.gms.internal.ads.zzaby.zzc = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzabx zza(byte[] r2) throws com.google.android.gms.internal.ads.zzbo {
            com.google.android.gms.internal.ads.zzej r0 = new com.google.android.gms.internal.ads.zzej
            int r1 = r2.length
            r0.<init>(r2, r1)
            r2 = 0
            com.google.android.gms.internal.ads.zzabx r2 = zzb(r0, r2)
            return r2
    }

    public static com.google.android.gms.internal.ads.zzabx zzb(com.google.android.gms.internal.ads.zzej r11, boolean r12) throws com.google.android.gms.internal.ads.zzbo {
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mp4a.40."
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 22
            r6 = 5
            if (r0 == r6) goto L27
            r6 = 29
            if (r0 != r6) goto L35
        L27:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r5) goto L35
            int r3 = r11.zzd(r2)
        L35:
            if (r12 == 0) goto Ld5
            r12 = 17
            r6 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L65
            if (r0 == r8) goto L65
            if (r0 == r9) goto L65
            if (r0 == r2) goto L65
            if (r0 == r6) goto L65
            r2 = 7
            if (r0 == r2) goto L65
            if (r0 == r12) goto L65
            switch(r0) {
                case 19: goto L65;
                case 20: goto L65;
                case 21: goto L65;
                case 22: goto L65;
                case 23: goto L65;
                default: goto L4f;
            }
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported audio object type: "
            r11.append(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbo r11 = com.google.android.gms.internal.ads.zzbo.zzc(r11)
            throw r11
        L65:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L72
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
        L72:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L7d
            r2 = 14
            r11.zzn(r2)
        L7d:
            boolean r2 = r11.zzp()
            if (r3 == 0) goto Lcf
            r10 = 20
            if (r0 == r6) goto L8b
            if (r0 != r10) goto L8e
            r0 = 20
        L8b:
            r11.zzn(r9)
        L8e:
            if (r2 == 0) goto Lab
            if (r0 != r5) goto L98
            r2 = 16
            r11.zzn(r2)
            goto L99
        L98:
            r5 = r0
        L99:
            if (r5 == r12) goto La5
            r12 = 19
            if (r5 == r12) goto La5
            if (r5 == r10) goto La5
            r12 = 23
            if (r5 != r12) goto La8
        La5:
            r11.zzn(r9)
        La8:
            r11.zzn(r7)
        Lab:
            switch(r0) {
                case 17: goto Laf;
                case 18: goto Lae;
                case 19: goto Laf;
                case 20: goto Laf;
                case 21: goto Laf;
                case 22: goto Laf;
                case 23: goto Laf;
                default: goto Lae;
            }
        Lae:
            goto Ld5
        Laf:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lb8
            if (r11 == r9) goto Lb9
            goto Ld5
        Lb8:
            r9 = r11
        Lb9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Unsupported epConfig: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzbo r11 = com.google.android.gms.internal.ads.zzbo.zzc(r11)
            throw r11
        Lcf:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Ld5:
            int[] r11 = com.google.android.gms.internal.ads.zzaby.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Le3
            com.google.android.gms.internal.ads.zzabx r12 = new com.google.android.gms.internal.ads.zzabx
            r12.<init>(r1, r11, r4, r0)
            return r12
        Le3:
            com.google.android.gms.internal.ads.zzbo r11 = com.google.android.gms.internal.ads.zzbo.zza(r0, r0)
            throw r11
    }

    private static int zzc(com.google.android.gms.internal.ads.zzej r2) {
            r0 = 5
            int r0 = r2.zzd(r0)
            r1 = 31
            if (r0 != r1) goto L11
            r0 = 6
            int r2 = r2.zzd(r0)
            int r2 = r2 + 32
            return r2
        L11:
            return r0
    }

    private static int zzd(com.google.android.gms.internal.ads.zzej r3) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 4
            int r0 = r3.zzd(r0)
            r1 = 0
            r2 = 15
            if (r0 != r2) goto L1e
            int r0 = r3.zza()
            r2 = 24
            if (r0 < r2) goto L17
            int r3 = r3.zzd(r2)
            goto L26
        L17:
            java.lang.String r3 = "AAC header insufficient data"
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zza(r3, r1)
            throw r3
        L1e:
            r3 = 13
            if (r0 >= r3) goto L27
            int[] r3 = com.google.android.gms.internal.ads.zzaby.zzb
            r3 = r3[r0]
        L26:
            return r3
        L27:
            java.lang.String r3 = "AAC header wrong Sampling Frequency Index"
            com.google.android.gms.internal.ads.zzbo r3 = com.google.android.gms.internal.ads.zzbo.zza(r3, r1)
            throw r3
    }
}
