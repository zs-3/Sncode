package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzba {
    public static final com.google.android.gms.measurement.internal.zzba zza = null;
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.Boolean zzd;
    private final java.lang.String zze;
    private final java.util.EnumMap zzf;

    static {
            com.google.android.gms.measurement.internal.zzba r0 = new com.google.android.gms.measurement.internal.zzba
            r1 = 0
            r2 = 100
            r0.<init>(r1, r2, r1, r1)
            com.google.android.gms.measurement.internal.zzba.zza = r0
            return
    }

    zzba(java.lang.Boolean r3, int r4, java.lang.Boolean r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            r2.zzf = r0
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzc
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzjx.zzh(r3)
            r0.put(r1, r3)
            r2.zzb = r4
            java.lang.String r3 = r2.zzl()
            r2.zzc = r3
            r2.zzd = r5
            r2.zze = r6
            return
    }

    private zzba(java.util.EnumMap r3, int r4, java.lang.Boolean r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            r2.zzf = r0
            r0.putAll(r3)
            r2.zzb = r4
            java.lang.String r3 = r2.zzl()
            r2.zzc = r3
            r2.zzd = r5
            r2.zze = r6
            return
    }

    public static com.google.android.gms.measurement.internal.zzba zzc(android.os.Bundle r7, int r8) {
            r0 = 0
            if (r7 != 0) goto L9
            com.google.android.gms.measurement.internal.zzba r7 = new com.google.android.gms.measurement.internal.zzba
            r7.<init>(r0, r8, r0, r0)
            return r7
        L9:
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r2 = com.google.android.gms.measurement.internal.zzjw.class
            r1.<init>(r2)
            com.google.android.gms.measurement.internal.zzjv r2 = com.google.android.gms.measurement.internal.zzjv.zzb
            com.google.android.gms.measurement.internal.zzjw[] r2 = r2.zzb()
            int r3 = r2.length
            r4 = 0
        L18:
            if (r4 >= r3) goto L2c
            r5 = r2[r4]
            java.lang.String r6 = r5.zze
            java.lang.String r6 = r7.getString(r6)
            com.google.android.gms.measurement.internal.zzju r6 = com.google.android.gms.measurement.internal.zzjx.zzd(r6)
            r1.put(r5, r6)
            int r4 = r4 + 1
            goto L18
        L2c:
            com.google.android.gms.measurement.internal.zzba r2 = new com.google.android.gms.measurement.internal.zzba
            java.lang.String r3 = "is_dma_region"
            boolean r4 = r7.containsKey(r3)
            if (r4 == 0) goto L3e
            java.lang.String r0 = r7.getString(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L3e:
            java.lang.String r3 = "cps_display_str"
            java.lang.String r7 = r7.getString(r3)
            r2.<init>(r1, r8, r0, r7)
            return r2
    }

    static com.google.android.gms.measurement.internal.zzba zzd(com.google.android.gms.measurement.internal.zzju r2, int r3) {
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r0 = com.google.android.gms.measurement.internal.zzjw.class
            r3.<init>(r0)
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zzc
            r3.put(r0, r2)
            com.google.android.gms.measurement.internal.zzba r2 = new com.google.android.gms.measurement.internal.zzba
            r0 = -10
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            return r2
    }

    public static com.google.android.gms.measurement.internal.zzba zze(java.lang.String r9) {
            if (r9 == 0) goto L44
            int r0 = r9.length()
            if (r0 > 0) goto L9
            goto L44
        L9:
            java.lang.String r0 = ":"
            java.lang.String[] r9 = r9.split(r0)
            r0 = 0
            r1 = r9[r0]
            int r1 = java.lang.Integer.parseInt(r1)
            java.util.EnumMap r2 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r3 = com.google.android.gms.measurement.internal.zzjw.class
            r2.<init>(r3)
            com.google.android.gms.measurement.internal.zzjv r3 = com.google.android.gms.measurement.internal.zzjv.zzb
            com.google.android.gms.measurement.internal.zzjw[] r3 = r3.zzb()
            int r4 = r3.length
            r5 = 1
            r6 = 0
        L26:
            if (r6 >= r4) goto L3d
            r7 = r3[r6]
            int r8 = r5 + 1
            r5 = r9[r5]
            char r5 = r5.charAt(r0)
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzjx.zzg(r5)
            r2.put(r7, r5)
            int r6 = r6 + 1
            r5 = r8
            goto L26
        L3d:
            com.google.android.gms.measurement.internal.zzba r9 = new com.google.android.gms.measurement.internal.zzba
            r0 = 0
            r9.<init>(r2, r1, r0, r0)
            return r9
        L44:
            com.google.android.gms.measurement.internal.zzba r9 = com.google.android.gms.measurement.internal.zzba.zza
            return r9
    }

    public static java.lang.Boolean zzg(android.os.Bundle r1) {
            if (r1 != 0) goto L3
            goto L20
        L3:
            java.lang.String r0 = "ad_personalization"
            java.lang.String r1 = r1.getString(r0)
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzjx.zzd(r1)
            if (r1 == 0) goto L20
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto L1d
            r0 = 3
            if (r1 == r0) goto L1a
            goto L20
        L1a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L1d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L20:
            r1 = 0
            return r1
    }

    private final java.lang.String zzl() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.zzb
            r0.append(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zzb
            com.google.android.gms.measurement.internal.zzjw[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        L12:
            if (r3 >= r2) goto L2d
            r4 = r1[r3]
            java.lang.String r5 = ":"
            r0.append(r5)
            java.util.EnumMap r5 = r6.zzf
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r4 = (com.google.android.gms.measurement.internal.zzju) r4
            char r4 = com.google.android.gms.measurement.internal.zzjx.zza(r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto L12
        L2d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.measurement.internal.zzba
            if (r0 != 0) goto L5
            goto L24
        L5:
            com.google.android.gms.measurement.internal.zzba r3 = (com.google.android.gms.measurement.internal.zzba) r3
            java.lang.String r0 = r2.zzc
            java.lang.String r1 = r3.zzc
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            java.lang.Boolean r0 = r2.zzd
            java.lang.Boolean r1 = r3.zzd
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.zze
            java.lang.String r3 = r3.zze
            boolean r3 = java.util.Objects.equals(r0, r3)
            return r3
        L24:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Boolean r0 = r3.zzd
            if (r0 != 0) goto L6
            r0 = 3
            goto L11
        L6:
            r1 = 1
            boolean r0 = r0.booleanValue()
            if (r1 == r0) goto L10
            r0 = 13
            goto L11
        L10:
            r0 = 7
        L11:
            java.lang.String r1 = r3.zze
            if (r1 != 0) goto L18
            r1 = 17
            goto L1c
        L18:
            int r1 = r1.hashCode()
        L1c:
            java.lang.String r2 = r3.zzc
            int r0 = r0 * 29
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r1 = r1 * 137
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source="
            r0.<init>(r1)
            int r1 = r6.zzb
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzjx.zzn(r1)
            r0.append(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zzb
            com.google.android.gms.measurement.internal.zzjw[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L63
            r4 = r1[r3]
            java.lang.String r5 = ","
            r0.append(r5)
            java.lang.String r5 = r4.zze
            r0.append(r5)
            java.lang.String r5 = "="
            r0.append(r5)
            java.util.EnumMap r5 = r6.zzf
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r4 = (com.google.android.gms.measurement.internal.zzju) r4
            java.lang.String r5 = "uninitialized"
            if (r4 != 0) goto L3b
            r0.append(r5)
            goto L60
        L3b:
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5d
            r5 = 1
            if (r4 == r5) goto L57
            r5 = 2
            if (r4 == r5) goto L51
            r5 = 3
            if (r4 == r5) goto L4b
            goto L60
        L4b:
            java.lang.String r4 = "granted"
            r0.append(r4)
            goto L60
        L51:
            java.lang.String r4 = "denied"
            r0.append(r4)
            goto L60
        L57:
            java.lang.String r4 = "eu_consent_policy"
            r0.append(r4)
            goto L60
        L5d:
            r0.append(r5)
        L60:
            int r3 = r3 + 1
            goto L18
        L63:
            java.lang.Boolean r1 = r6.zzd
            if (r1 == 0) goto L6f
            java.lang.String r2 = ",isDmaRegion="
            r0.append(r2)
            r0.append(r1)
        L6f:
            java.lang.String r1 = r6.zze
            if (r1 == 0) goto L7b
            java.lang.String r2 = ",cpsDisplayStr="
            r0.append(r2)
            r0.append(r1)
        L7b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int zza() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public final android.os.Bundle zzb() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.EnumMap r1 = r4.zzf
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.google.android.gms.measurement.internal.zzju r3 = (com.google.android.gms.measurement.internal.zzju) r3
            java.lang.String r3 = com.google.android.gms.measurement.internal.zzjx.zzo(r3)
            if (r3 == 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.measurement.internal.zzjw r2 = (com.google.android.gms.measurement.internal.zzjw) r2
            java.lang.String r2 = r2.zze
            r0.putString(r2, r3)
            goto Lf
        L33:
            java.lang.Boolean r1 = r4.zzd
            if (r1 == 0) goto L40
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "is_dma_region"
            r0.putString(r2, r1)
        L40:
            java.lang.String r1 = r4.zze
            if (r1 == 0) goto L49
            java.lang.String r2 = "cps_display_str"
            r0.putString(r2, r1)
        L49:
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzju zzf() {
            r2 = this;
            java.util.EnumMap r0 = r2.zzf
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzc
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.measurement.internal.zzju r0 = (com.google.android.gms.measurement.internal.zzju) r0
            if (r0 != 0) goto Le
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zza
        Le:
            return r0
    }

    public final java.lang.Boolean zzh() {
            r1 = this;
            java.lang.Boolean r0 = r1.zzd
            return r0
    }

    public final java.lang.String zzi() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.lang.String zzj() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public final boolean zzk() {
            r3 = this;
            java.util.EnumMap r0 = r3.zzf
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.google.android.gms.measurement.internal.zzju r1 = (com.google.android.gms.measurement.internal.zzju) r1
            com.google.android.gms.measurement.internal.zzju r2 = com.google.android.gms.measurement.internal.zzju.zza
            if (r1 == r2) goto La
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }
}
