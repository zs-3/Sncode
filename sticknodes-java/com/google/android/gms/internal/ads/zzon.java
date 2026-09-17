package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzon {
    public static boolean zza(android.media.AudioManager r5, com.google.android.gms.internal.ads.zzpa r6) {
            r0 = 0
            r1 = 1
            if (r6 != 0) goto Ld
            java.util.Objects.requireNonNull(r5)
            r6 = 2
            android.media.AudioDeviceInfo[] r5 = r5.getDevices(r6)
            goto L13
        Ld:
            android.media.AudioDeviceInfo[] r5 = new android.media.AudioDeviceInfo[r1]
            android.media.AudioDeviceInfo r6 = r6.zza
            r5[r0] = r6
        L13:
            com.google.android.gms.internal.ads.zzgbc r6 = zzb()
            int r2 = r5.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L2f
            r4 = r5[r3]
            int r4 = r4.getType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r6.contains(r4)
            if (r4 == 0) goto L2c
            return r1
        L2c:
            int r3 = r3 + 1
            goto L19
        L2f:
            return r0
    }

    private static com.google.android.gms.internal.ads.zzgbc<java.lang.Integer> zzb() {
            com.google.android.gms.internal.ads.zzgbb r0 = new com.google.android.gms.internal.ads.zzgbb
            r0.<init>()
            r1 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            r0.zzg(r2)
            int r2 = com.google.android.gms.internal.ads.zzeu.zza
            r3 = 31
            if (r2 < r3) goto L37
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            r3 = 26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r4] = r3
            r3 = 27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r5] = r3
            r0.zzg(r1)
        L37:
            r1 = 33
            if (r2 < r1) goto L44
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.zzf(r1)
        L44:
            com.google.android.gms.internal.ads.zzgbc r0 = r0.zzi()
            return r0
    }
}
