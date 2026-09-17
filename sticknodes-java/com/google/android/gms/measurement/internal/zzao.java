package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
final class zzao {
    private final java.util.EnumMap zza;

    zzao() {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            r2.zza = r0
            return
    }

    private zzao(java.util.EnumMap r3) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            r2.zza = r0
            r0.putAll(r3)
            return
    }

    public static com.google.android.gms.measurement.internal.zzao zzb(java.lang.String r7) {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            int r1 = r7.length()
            com.google.android.gms.measurement.internal.zzjw[] r2 = com.google.android.gms.measurement.internal.zzjw.values()
            int r2 = r2.length
            if (r1 < r2) goto L3d
            r1 = 0
            char r2 = r7.charAt(r1)
            r3 = 49
            if (r2 == r3) goto L1c
            goto L3d
        L1c:
            com.google.android.gms.measurement.internal.zzjw[] r2 = com.google.android.gms.measurement.internal.zzjw.values()
            int r3 = r2.length
            r4 = 1
        L22:
            if (r1 >= r3) goto L37
            r5 = r2[r1]
            int r6 = r4 + 1
            char r4 = r7.charAt(r4)
            com.google.android.gms.measurement.internal.zzan r4 = com.google.android.gms.measurement.internal.zzan.zzb(r4)
            r0.put(r5, r4)
            int r1 = r1 + 1
            r4 = r6
            goto L22
        L37:
            com.google.android.gms.measurement.internal.zzao r7 = new com.google.android.gms.measurement.internal.zzao
            r7.<init>(r0)
            return r7
        L3d:
            com.google.android.gms.measurement.internal.zzao r7 = new com.google.android.gms.measurement.internal.zzao
            r7.<init>()
            return r7
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjw[] r1 = com.google.android.gms.measurement.internal.zzjw.values()
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L27
            r4 = r1[r3]
            java.util.EnumMap r5 = r6.zza
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzan r4 = (com.google.android.gms.measurement.internal.zzan) r4
            if (r4 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzan r4 = com.google.android.gms.measurement.internal.zzan.zza
        L1d:
            char r4 = com.google.android.gms.measurement.internal.zzan.zza(r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto Ld
        L27:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzan zza(com.google.android.gms.measurement.internal.zzjw r2) {
            r1 = this;
            java.util.EnumMap r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.measurement.internal.zzan r2 = (com.google.android.gms.measurement.internal.zzan) r2
            if (r2 != 0) goto Lc
            com.google.android.gms.measurement.internal.zzan r2 = com.google.android.gms.measurement.internal.zzan.zza
        Lc:
            return r2
    }

    public final void zzc(com.google.android.gms.measurement.internal.zzjw r3, int r4) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zza
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zze
            goto L20
        L18:
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zzd
            goto L20
        L1b:
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zzf
            goto L20
        L1e:
            com.google.android.gms.measurement.internal.zzan r0 = com.google.android.gms.measurement.internal.zzan.zzh
        L20:
            java.util.EnumMap r4 = r2.zza
            r4.put(r3, r0)
            return
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzjw r2, com.google.android.gms.measurement.internal.zzan r3) {
            r1 = this;
            java.util.EnumMap r0 = r1.zza
            r0.put(r2, r3)
            return
    }
}
