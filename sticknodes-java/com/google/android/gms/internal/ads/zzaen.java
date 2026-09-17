package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaen {
    public static int zza(int r1) {
            r0 = 0
        L1:
            if (r1 <= 0) goto L8
            int r1 = r1 >>> 1
            int r0 = r0 + 1
            goto L1
        L8:
            return r0
    }

    public static com.google.android.gms.internal.ads.zzbk zzb(java.util.List r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r8.size()
            if (r2 >= r3) goto L5f
            java.lang.Object r3 = r8.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
            java.lang.String r4 = "="
            r5 = 2
            java.lang.String[] r4 = r3.split(r4, r5)
            int r6 = r4.length
            java.lang.String r7 = "VorbisUtil"
            if (r6 == r5) goto L2b
            java.lang.String r4 = "Failed to parse Vorbis comment: "
            java.lang.String r3 = r4.concat(r3)
            com.google.android.gms.internal.ads.zzea.zzf(r7, r3)
            goto L5c
        L2b:
            r3 = r4[r1]
            java.lang.String r5 = "METADATA_BLOCK_PICTURE"
            boolean r3 = r3.equals(r5)
            r5 = 1
            if (r3 == 0) goto L50
            r3 = r4[r5]     // Catch: java.lang.RuntimeException -> L49
            byte[] r3 = android.util.Base64.decode(r3, r1)     // Catch: java.lang.RuntimeException -> L49
            com.google.android.gms.internal.ads.zzek r4 = new com.google.android.gms.internal.ads.zzek     // Catch: java.lang.RuntimeException -> L49
            r4.<init>(r3)     // Catch: java.lang.RuntimeException -> L49
            com.google.android.gms.internal.ads.zzagb r3 = com.google.android.gms.internal.ads.zzagb.zzb(r4)     // Catch: java.lang.RuntimeException -> L49
            r0.add(r3)     // Catch: java.lang.RuntimeException -> L49
            goto L5c
        L49:
            r3 = move-exception
            java.lang.String r4 = "Failed to parse vorbis picture"
            com.google.android.gms.internal.ads.zzea.zzg(r7, r4, r3)
            goto L5c
        L50:
            com.google.android.gms.internal.ads.zzahs r3 = new com.google.android.gms.internal.ads.zzahs
            r6 = r4[r1]
            r4 = r4[r5]
            r3.<init>(r6, r4)
            r0.add(r3)
        L5c:
            int r2 = r2 + 1
            goto L7
        L5f:
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L67
            r8 = 0
            return r8
        L67:
            com.google.android.gms.internal.ads.zzbk r8 = new com.google.android.gms.internal.ads.zzbk
            r8.<init>(r0)
            return r8
    }

    public static com.google.android.gms.internal.ads.zzaek zzc(com.google.android.gms.internal.ads.zzek r8, boolean r9, boolean r10) throws com.google.android.gms.internal.ads.zzbo {
            r0 = 0
            if (r9 == 0) goto L7
            r9 = 3
            zzd(r9, r8, r0)
        L7:
            long r1 = r8.zzs()
            int r9 = (int) r1
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = r8.zzB(r9, r1)
            int r1 = r9.length()
            long r2 = r8.zzs()
            int r4 = (int) r2
            java.lang.String[] r4 = new java.lang.String[r4]
            int r1 = r1 + 15
        L1f:
            long r5 = (long) r0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L3b
            long r5 = r8.zzs()
            int r6 = (int) r5
            int r1 = r1 + 4
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r5 = r8.zzB(r6, r5)
            r4[r0] = r5
            int r5 = r5.length()
            int r1 = r1 + r5
            int r0 = r0 + 1
            goto L1f
        L3b:
            if (r10 == 0) goto L4e
            int r8 = r8.zzm()
            r8 = r8 & 1
            if (r8 == 0) goto L46
            goto L4e
        L46:
            r8 = 0
            java.lang.String r9 = "framing bit expected to be set"
            com.google.android.gms.internal.ads.zzbo r8 = com.google.android.gms.internal.ads.zzbo.zza(r9, r8)
            throw r8
        L4e:
            int r1 = r1 + 1
            com.google.android.gms.internal.ads.zzaek r8 = new com.google.android.gms.internal.ads.zzaek
            r8.<init>(r9, r4, r1)
            return r8
    }

    public static boolean zzd(int r4, com.google.android.gms.internal.ads.zzek r5, boolean r6) throws com.google.android.gms.internal.ads.zzbo {
            int r0 = r5.zzb()
            r1 = 0
            r2 = 0
            r3 = 7
            if (r0 >= r3) goto L26
            if (r6 == 0) goto Lc
            return r1
        Lc:
            int r4 = r5.zzb()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "too short header: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.google.android.gms.internal.ads.zzbo r4 = com.google.android.gms.internal.ads.zzbo.zza(r4, r2)
            throw r4
        L26:
            int r0 = r5.zzm()
            if (r0 == r4) goto L42
            if (r6 == 0) goto L2f
            return r1
        L2f:
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "expected header type "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzbo r4 = com.google.android.gms.internal.ads.zzbo.zza(r4, r2)
            throw r4
        L42:
            int r4 = r5.zzm()
            r0 = 118(0x76, float:1.65E-43)
            if (r4 != r0) goto L75
            int r4 = r5.zzm()
            r0 = 111(0x6f, float:1.56E-43)
            if (r4 != r0) goto L75
            int r4 = r5.zzm()
            r0 = 114(0x72, float:1.6E-43)
            if (r4 != r0) goto L75
            int r4 = r5.zzm()
            r0 = 98
            if (r4 != r0) goto L75
            int r4 = r5.zzm()
            r0 = 105(0x69, float:1.47E-43)
            if (r4 != r0) goto L75
            int r4 = r5.zzm()
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L73
            goto L75
        L73:
            r4 = 1
            return r4
        L75:
            if (r6 == 0) goto L78
            return r1
        L78:
            java.lang.String r4 = "expected characters 'vorbis'"
            com.google.android.gms.internal.ads.zzbo r4 = com.google.android.gms.internal.ads.zzbo.zza(r4, r2)
            throw r4
    }
}
