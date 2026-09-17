package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcj {
    private static final java.util.Map zza = null;
    private static java.util.List zzb;
    private static final java.lang.Object zzc = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzcj.zza = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.ads.internal.util.zzcj.zzc = r0
            return
    }

    public static java.util.List zza(java.lang.String r13) {
            java.lang.Object r0 = com.google.android.gms.ads.internal.util.zzcj.zzc
            monitor-enter(r0)
            java.util.Map r1 = com.google.android.gms.ads.internal.util.zzcj.zza     // Catch: java.lang.Throwable -> L12c
            boolean r2 = r1.containsKey(r13)     // Catch: java.lang.Throwable -> L12c
            if (r2 == 0) goto L13
            java.lang.Object r13 = r1.get(r13)     // Catch: java.lang.Throwable -> L12c
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L12c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12c
            return r13
        L13:
            monitor-enter(r0)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.util.List r1 = com.google.android.gms.ads.internal.util.zzcj.zzb     // Catch: java.lang.Throwable -> L105
            r2 = 0
            if (r1 == 0) goto L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L105
            goto L2b
        L1b:
            android.media.MediaCodecList r1 = new android.media.MediaCodecList     // Catch: java.lang.Throwable -> L105
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L105
            android.media.MediaCodecInfo[] r1 = r1.getCodecInfos()     // Catch: java.lang.Throwable -> L105
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L105
            com.google.android.gms.ads.internal.util.zzcj.zzb = r1     // Catch: java.lang.Throwable -> L105
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L105
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r1.<init>()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.util.List r3 = com.google.android.gms.ads.internal.util.zzcj.zzb     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
        L36:
            boolean r4 = r3.hasNext()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            if (r4 == 0) goto Lfe
            java.lang.Object r4 = r3.next()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            android.media.MediaCodecInfo r4 = (android.media.MediaCodecInfo) r4     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            boolean r5 = r4.isEncoder()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            if (r5 != 0) goto L36
            java.lang.String[] r5 = r4.getSupportedTypes()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            boolean r5 = r5.contains(r13)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            if (r5 == 0) goto L36
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.<init>()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r6 = "codecName"
            java.lang.String r7 = r4.getName()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r6, r7)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            android.media.MediaCodecInfo$CodecCapabilities r4 = r4.getCapabilitiesForType(r13)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r6.<init>()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            android.media.MediaCodecInfo$CodecProfileLevel[] r7 = r4.profileLevels     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            int r8 = r7.length     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r9 = 0
        L71:
            if (r9 >= r8) goto L8f
            r10 = r7[r9]     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r11 = 2
            java.lang.Integer[] r11 = new java.lang.Integer[r11]     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            int r12 = r10.profile     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r11[r2] = r12     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            int r10 = r10.level     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r12 = 1
            r11[r12] = r10     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r6.add(r11)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            int r9 = r9 + 1
            goto L71
        L8f:
            java.lang.String r7 = "profileLevels"
            r5.put(r7, r6)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            android.media.MediaCodecInfo$VideoCapabilities r6 = r4.getVideoCapabilities()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "bitRatesBps"
            android.util.Range r8 = r6.getBitrateRange()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer[] r8 = zzb(r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "widthAlignment"
            int r8 = r6.getWidthAlignment()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "heightAlignment"
            int r8 = r6.getHeightAlignment()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "frameRates"
            android.util.Range r8 = r6.getSupportedFrameRates()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer[] r8 = zzb(r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "widths"
            android.util.Range r8 = r6.getSupportedWidths()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer[] r8 = zzb(r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r8)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.String r7 = "heights"
            android.util.Range r6 = r6.getSupportedHeights()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer[] r6 = zzb(r6)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r7, r6)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r7 = 23
            if (r6 < r7) goto Lf9
            java.lang.String r6 = "instancesLimit"
            int r4 = r4.getMaxSupportedInstances()     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r5.put(r6, r4)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
        Lf9:
            r1.add(r5)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            goto L36
        Lfe:
            java.util.Map r2 = com.google.android.gms.ads.internal.util.zzcj.zza     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            r2.put(r13, r1)     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12c
            return r1
        L105:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L105
            throw r1     // Catch: java.lang.LinkageError -> L108 java.lang.RuntimeException -> L10a java.lang.Throwable -> L12c
        L108:
            r1 = move-exception
            goto L10b
        L10a:
            r1 = move-exception
        L10b:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L12c
            r2.<init>()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r3 = "error"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L12c
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L12c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12c
            r1.<init>()     // Catch: java.lang.Throwable -> L12c
            r1.add(r2)     // Catch: java.lang.Throwable -> L12c
            java.util.Map r2 = com.google.android.gms.ads.internal.util.zzcj.zza     // Catch: java.lang.Throwable -> L12c
            r2.put(r13, r1)     // Catch: java.lang.Throwable -> L12c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12c
            return r1
        L12c:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12c
            throw r13
    }

    private static java.lang.Integer[] zzb(android.util.Range r3) {
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            java.lang.Comparable r1 = r3.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            r0[r2] = r1
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1 = 1
            r0[r1] = r3
            return r0
    }
}
