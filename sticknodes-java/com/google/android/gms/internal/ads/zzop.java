package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzop {
    public static com.google.android.gms.internal.ads.zzos zza(android.media.AudioManager r7, com.google.android.gms.internal.ads.zzh r8) {
            com.google.android.gms.internal.ads.zzf r8 = r8.zza()
            android.media.AudioAttributes r8 = r8.zza
            java.util.List r7 = r7.getDirectProfilesForAttributes(r8)
            com.google.android.gms.internal.ads.zzos r8 = new com.google.android.gms.internal.ads.zzos
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashSet r2 = new java.util.HashSet
            r3 = 1
            int[] r4 = new int[r3]
            r5 = 12
            r6 = 0
            r4[r6] = r5
            java.util.List r4 = com.google.android.gms.internal.ads.zzgdu.zzg(r4)
            r2.<init>(r4)
            r0.put(r1, r2)
        L2a:
            int r1 = r7.size()
            if (r6 >= r1) goto L85
            java.lang.Object r1 = r7.get(r6)
            android.media.AudioProfile r1 = (android.media.AudioProfile) r1
            int r2 = r1.getEncapsulationType()
            if (r2 != r3) goto L3d
            goto L82
        L3d:
            int r2 = r1.getFormat()
            boolean r4 = com.google.android.gms.internal.ads.zzeu.zzI(r2)
            if (r4 != 0) goto L53
            com.google.android.gms.internal.ads.zzgba r4 = com.google.android.gms.internal.ads.zzos.zzb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L82
        L53:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L72
            java.lang.Object r2 = r0.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            java.util.Objects.requireNonNull(r2)
            int[] r1 = r1.getChannelMasks()
            java.util.List r1 = com.google.android.gms.internal.ads.zzgdu.zzg(r1)
            r2.addAll(r1)
            goto L82
        L72:
            java.util.HashSet r4 = new java.util.HashSet
            int[] r1 = r1.getChannelMasks()
            java.util.List r1 = com.google.android.gms.internal.ads.zzgdu.zzg(r1)
            r4.<init>(r1)
            r0.put(r2, r4)
        L82:
            int r6 = r6 + 1
            goto L2a
        L85:
            com.google.android.gms.internal.ads.zzgau r7 = new com.google.android.gms.internal.ads.zzgau
            r7.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L92:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.zzoq r2 = new com.google.android.gms.internal.ads.zzoq
            java.lang.Object r3 = r1.getKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            r2.<init>(r3, r1)
            r7.zzf(r2)
            goto L92
        Lb7:
            com.google.android.gms.internal.ads.zzgax r7 = r7.zzi()
            r0 = 0
            r8.<init>(r7, r0)
            return r8
    }

    public static com.google.android.gms.internal.ads.zzpa zzb(android.media.AudioManager r1, com.google.android.gms.internal.ads.zzh r2) {
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzf r2 = r2.zza()     // Catch: java.lang.RuntimeException -> L21
            android.media.AudioAttributes r2 = r2.zza     // Catch: java.lang.RuntimeException -> L21
            java.util.List r1 = r1.getAudioDevicesForAttributes(r2)     // Catch: java.lang.RuntimeException -> L21
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L14
            goto L21
        L14:
            com.google.android.gms.internal.ads.zzpa r2 = new com.google.android.gms.internal.ads.zzpa
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            android.media.AudioDeviceInfo r1 = (android.media.AudioDeviceInfo) r1
            r2.<init>(r1)
            return r2
        L21:
            r1 = 0
            return r1
    }
}
