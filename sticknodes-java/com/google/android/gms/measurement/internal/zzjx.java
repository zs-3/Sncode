package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjx {
    public static final com.google.android.gms.measurement.internal.zzjx zza = null;
    private final java.util.EnumMap zzb;
    private final int zzc;

    static {
            com.google.android.gms.measurement.internal.zzjx r0 = new com.google.android.gms.measurement.internal.zzjx
            r1 = 0
            r2 = 100
            r0.<init>(r1, r1, r2)
            com.google.android.gms.measurement.internal.zzjx.zza = r0
            return
    }

    public zzjx(java.lang.Boolean r3, java.lang.Boolean r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r4 = com.google.android.gms.measurement.internal.zzjw.class
            r3.<init>(r4)
            r2.zzb = r3
            com.google.android.gms.measurement.internal.zzjw r4 = com.google.android.gms.measurement.internal.zzjw.zza
            r0 = 0
            com.google.android.gms.measurement.internal.zzju r1 = zzh(r0)
            r3.put(r4, r1)
            com.google.android.gms.measurement.internal.zzjw r4 = com.google.android.gms.measurement.internal.zzjw.zzb
            com.google.android.gms.measurement.internal.zzju r0 = zzh(r0)
            r3.put(r4, r0)
            r2.zzc = r5
            return
    }

    private zzjx(java.util.EnumMap r3, int r4) {
            r2 = this;
            r2.<init>()
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            r2.zzb = r0
            r0.putAll(r3)
            r2.zzc = r4
            return
    }

    static char zza(com.google.android.gms.measurement.internal.zzju r1) {
            if (r1 == 0) goto L19
            int r1 = r1.ordinal()
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 == r0) goto L13
            r0 = 3
            if (r1 == r0) goto L10
            goto L19
        L10:
            r1 = 49
            return r1
        L13:
            r1 = 48
            return r1
        L16:
            r1 = 43
            return r1
        L19:
            r1 = 45
            return r1
    }

    static com.google.android.gms.measurement.internal.zzju zzd(java.lang.String r1) {
            if (r1 != 0) goto L5
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zza
            return r1
        L5:
            java.lang.String r0 = "granted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L10
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zzd
            return r1
        L10:
            java.lang.String r0 = "denied"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1b
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zzc
            return r1
        L1b:
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zza
            return r1
    }

    static com.google.android.gms.measurement.internal.zzju zzg(char r1) {
            r0 = 43
            if (r1 == r0) goto L15
            r0 = 48
            if (r1 == r0) goto L12
            r0 = 49
            if (r1 == r0) goto Lf
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zza
            return r1
        Lf:
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zzd
            return r1
        L12:
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zzc
            return r1
        L15:
            com.google.android.gms.measurement.internal.zzju r1 = com.google.android.gms.measurement.internal.zzju.zzb
            return r1
    }

    static com.google.android.gms.measurement.internal.zzju zzh(java.lang.Boolean r0) {
            if (r0 != 0) goto L5
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zza
            return r0
        L5:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Le
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zzd
            return r0
        Le:
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zzc
            return r0
    }

    public static com.google.android.gms.measurement.internal.zzjx zzi(android.os.Bundle r6, int r7) {
            if (r6 != 0) goto L9
            com.google.android.gms.measurement.internal.zzjx r6 = new com.google.android.gms.measurement.internal.zzjx
            r0 = 0
            r6.<init>(r0, r0, r7)
            return r6
        L9:
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = com.google.android.gms.measurement.internal.zzjv.zza(r1)
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]
            java.lang.String r5 = r4.zze
            java.lang.String r5 = r6.getString(r5)
            com.google.android.gms.measurement.internal.zzju r5 = zzd(r5)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto L18
        L2c:
            com.google.android.gms.measurement.internal.zzjx r6 = new com.google.android.gms.measurement.internal.zzjx
            r6.<init>(r0, r7)
            return r6
    }

    public static com.google.android.gms.measurement.internal.zzjx zzj(com.google.android.gms.measurement.internal.zzju r1, com.google.android.gms.measurement.internal.zzju r2, int r3) {
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r0 = com.google.android.gms.measurement.internal.zzjw.class
            r3.<init>(r0)
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.zza
            r3.put(r0, r1)
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            r3.put(r1, r2)
            com.google.android.gms.measurement.internal.zzjx r1 = new com.google.android.gms.measurement.internal.zzjx
            r2 = -10
            r1.<init>(r3, r2)
            return r1
    }

    public static com.google.android.gms.measurement.internal.zzjx zzk(java.lang.String r7, int r8) {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = r1.zzb()
            r2 = 0
        Le:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            if (r7 != 0) goto L16
            java.lang.String r3 = ""
            goto L17
        L16:
            r3 = r7
        L17:
            r4 = r1[r2]
            int r5 = r2 + 2
            int r6 = r3.length()
            if (r5 >= r6) goto L2d
            char r3 = r3.charAt(r5)
            com.google.android.gms.measurement.internal.zzju r3 = zzg(r3)
            r0.put(r4, r3)
            goto L32
        L2d:
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.zza
            r0.put(r4, r3)
        L32:
            int r2 = r2 + 1
            goto Le
        L35:
            com.google.android.gms.measurement.internal.zzjx r7 = new com.google.android.gms.measurement.internal.zzjx
            r7.<init>(r0, r8)
            return r7
    }

    static java.lang.String zzn(int r1) {
            r0 = -30
            if (r1 == r0) goto L2f
            r0 = -20
            if (r1 == r0) goto L2c
            r0 = -10
            if (r1 == r0) goto L29
            if (r1 == 0) goto L26
            r0 = 30
            if (r1 == r0) goto L23
            r0 = 90
            if (r1 == r0) goto L20
            r0 = 100
            if (r1 == r0) goto L1d
            java.lang.String r1 = "OTHER"
            return r1
        L1d:
            java.lang.String r1 = "UNKNOWN"
            return r1
        L20:
            java.lang.String r1 = "REMOTE_CONFIG"
            return r1
        L23:
            java.lang.String r1 = "1P_INIT"
            return r1
        L26:
            java.lang.String r1 = "1P_API"
            return r1
        L29:
            java.lang.String r1 = "MANIFEST"
            return r1
        L2c:
            java.lang.String r1 = "API"
            return r1
        L2f:
            java.lang.String r1 = "TCF"
            return r1
    }

    static java.lang.String zzo(com.google.android.gms.measurement.internal.zzju r1) {
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.String r1 = "granted"
            return r1
        Lf:
            java.lang.String r1 = "denied"
            return r1
    }

    public static boolean zzs(int r2, int r3) {
            r0 = -30
            r1 = -20
            if (r2 != r1) goto La
            if (r3 == r0) goto L17
            r2 = -20
        La:
            if (r2 != r0) goto Lf
            if (r3 == r1) goto L17
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 != r3) goto L13
            goto L17
        L13:
            if (r2 < r3) goto L17
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.measurement.internal.zzjx
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.measurement.internal.zzjx r8 = (com.google.android.gms.measurement.internal.zzjx) r8
            com.google.android.gms.measurement.internal.zzjv r0 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r0 = com.google.android.gms.measurement.internal.zzjv.zza(r0)
            int r2 = r0.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L26
            r4 = r0[r3]
            java.util.EnumMap r5 = r7.zzb
            java.lang.Object r5 = r5.get(r4)
            java.util.EnumMap r6 = r8.zzb
            java.lang.Object r4 = r6.get(r4)
            if (r5 == r4) goto L23
            return r1
        L23:
            int r3 = r3 + 1
            goto L10
        L26:
            int r0 = r7.zzc
            int r8 = r8.zzc
            if (r0 != r8) goto L2e
            r8 = 1
            return r8
        L2e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.util.EnumMap r0 = r3.zzb
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            int r1 = r3.zzc
            int r1 = r1 * 17
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()
            com.google.android.gms.measurement.internal.zzju r2 = (com.google.android.gms.measurement.internal.zzju) r2
            int r1 = r1 * 31
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto Le
        L22:
            return r1
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source="
            r0.<init>(r1)
            int r1 = r6.zzc
            java.lang.String r1 = zzn(r1)
            r0.append(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = com.google.android.gms.measurement.internal.zzjv.zza(r1)
            int r2 = r1.length
            r3 = 0
        L18:
            if (r3 >= r2) goto L3d
            r4 = r1[r3]
            java.lang.String r5 = ","
            r0.append(r5)
            java.lang.String r5 = r4.zze
            r0.append(r5)
            java.lang.String r5 = "="
            r0.append(r5)
            java.util.EnumMap r5 = r6.zzb
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r4 = (com.google.android.gms.measurement.internal.zzju) r4
            if (r4 != 0) goto L37
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.zza
        L37:
            r0.append(r4)
            int r3 = r3 + 1
            goto L18
        L3d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public final android.os.Bundle zzc() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.EnumMap r1 = r4.zzb
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.google.android.gms.measurement.internal.zzju r3 = (com.google.android.gms.measurement.internal.zzju) r3
            java.lang.String r3 = zzo(r3)
            if (r3 == 0) goto Lf
            java.lang.Object r2 = r2.getKey()
            com.google.android.gms.measurement.internal.zzjw r2 = (com.google.android.gms.measurement.internal.zzjw) r2
            java.lang.String r2 = r2.zze
            r0.putString(r2, r3)
            goto Lf
        L33:
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzju zze() {
            r2 = this;
            java.util.EnumMap r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.measurement.internal.zzju r0 = (com.google.android.gms.measurement.internal.zzju) r0
            if (r0 != 0) goto Le
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zza
        Le:
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzju zzf() {
            r2 = this;
            java.util.EnumMap r0 = r2.zzb
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.zzb
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.measurement.internal.zzju r0 = (com.google.android.gms.measurement.internal.zzju) r0
            if (r0 != 0) goto Le
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zza
        Le:
            return r0
    }

    public final com.google.android.gms.measurement.internal.zzjx zzl(com.google.android.gms.measurement.internal.zzjx r9) {
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = com.google.android.gms.measurement.internal.zzjv.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r5 = (com.google.android.gms.measurement.internal.zzju) r5
            java.util.EnumMap r6 = r9.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.measurement.internal.zzju r6 = (com.google.android.gms.measurement.internal.zzju) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            com.google.android.gms.measurement.internal.zzju r7 = com.google.android.gms.measurement.internal.zzju.zza
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzju r7 = com.google.android.gms.measurement.internal.zzju.zzb
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            com.google.android.gms.measurement.internal.zzju r7 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzju.zzd
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            com.google.android.gms.measurement.internal.zzjx r9 = new com.google.android.gms.measurement.internal.zzjx
            r1 = 100
            r9.<init>(r0, r1)
            return r9
    }

    public final com.google.android.gms.measurement.internal.zzjx zzm(com.google.android.gms.measurement.internal.zzjx r8) {
            r7 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.zzjw> r1 = com.google.android.gms.measurement.internal.zzjw.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = com.google.android.gms.measurement.internal.zzjv.zza(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L2f
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r5 = (com.google.android.gms.measurement.internal.zzju) r5
            com.google.android.gms.measurement.internal.zzju r6 = com.google.android.gms.measurement.internal.zzju.zza
            if (r5 != r6) goto L27
            java.util.EnumMap r5 = r8.zzb
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r5 = (com.google.android.gms.measurement.internal.zzju) r5
        L27:
            if (r5 == 0) goto L2c
            r0.put(r4, r5)
        L2c:
            int r3 = r3 + 1
            goto Lf
        L2f:
            int r8 = r7.zzc
            com.google.android.gms.measurement.internal.zzjx r1 = new com.google.android.gms.measurement.internal.zzjx
            r1.<init>(r0, r8)
            return r1
    }

    public final java.lang.String zzp() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.zzb
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r4 = (com.google.android.gms.measurement.internal.zzju) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String zzq() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.zzjv r1 = com.google.android.gms.measurement.internal.zzjv.zza
            com.google.android.gms.measurement.internal.zzjw[] r1 = r1.zzb()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L25
            r4 = r1[r3]
            java.util.EnumMap r5 = r6.zzb
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.measurement.internal.zzju r4 = (com.google.android.gms.measurement.internal.zzju) r4
            char r4 = zza(r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto Lf
        L25:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean zzr(com.google.android.gms.measurement.internal.zzjw r2) {
            r1 = this;
            java.util.EnumMap r0 = r1.zzb
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.measurement.internal.zzju r2 = (com.google.android.gms.measurement.internal.zzju) r2
            com.google.android.gms.measurement.internal.zzju r0 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r2 != r0) goto Le
            r2 = 0
            return r2
        Le:
            r2 = 1
            return r2
    }

    public final boolean zzt() {
            r3 = this;
            java.util.EnumMap r0 = r3.zzb
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

    public final boolean zzu(com.google.android.gms.measurement.internal.zzjx r9) {
            r8 = this;
            java.util.EnumMap r0 = r8.zzb
            java.util.Set r1 = r0.keySet()
            r2 = 0
            com.google.android.gms.measurement.internal.zzjw[] r3 = new com.google.android.gms.measurement.internal.zzjw[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            com.google.android.gms.measurement.internal.zzjw[] r1 = (com.google.android.gms.measurement.internal.zzjw[]) r1
            int r3 = r1.length
            r4 = 0
        L11:
            if (r4 >= r3) goto L2e
            r5 = r1[r4]
            java.lang.Object r6 = r0.get(r5)
            com.google.android.gms.measurement.internal.zzju r6 = (com.google.android.gms.measurement.internal.zzju) r6
            java.util.EnumMap r7 = r9.zzb
            java.lang.Object r5 = r7.get(r5)
            com.google.android.gms.measurement.internal.zzju r5 = (com.google.android.gms.measurement.internal.zzju) r5
            com.google.android.gms.measurement.internal.zzju r7 = com.google.android.gms.measurement.internal.zzju.zzc
            if (r6 != r7) goto L2b
            if (r5 == r7) goto L2b
            r2 = 1
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L11
        L2e:
            return r2
    }
}
