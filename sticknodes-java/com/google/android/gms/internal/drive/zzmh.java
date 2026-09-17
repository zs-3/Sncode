package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzmh {
    private static final java.lang.Class<?> zzuz = null;
    private static final com.google.android.gms.internal.drive.zzmx<?, ?> zzva = null;
    private static final com.google.android.gms.internal.drive.zzmx<?, ?> zzvb = null;
    private static final com.google.android.gms.internal.drive.zzmx<?, ?> zzvc = null;

    static {
            java.lang.Class r0 = zzep()
            com.google.android.gms.internal.drive.zzmh.zzuz = r0
            r0 = 0
            com.google.android.gms.internal.drive.zzmx r0 = zzf(r0)
            com.google.android.gms.internal.drive.zzmh.zzva = r0
            r0 = 1
            com.google.android.gms.internal.drive.zzmx r0 = zzf(r0)
            com.google.android.gms.internal.drive.zzmh.zzvb = r0
            com.google.android.gms.internal.drive.zzmz r0 = new com.google.android.gms.internal.drive.zzmz
            r0.<init>()
            com.google.android.gms.internal.drive.zzmh.zzvc = r0
            return
    }

    static int zza(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.drive.zzle
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzle r5 = (com.google.android.gms.internal.drive.zzle) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzo(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzo(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    private static <UT, UB> UB zza(int r2, int r3, UB r4, com.google.android.gms.internal.drive.zzmx<UT, UB> r5) {
            if (r4 != 0) goto L6
            java.lang.Object r4 = r5.zzez()
        L6:
            long r0 = (long) r3
            r5.zza(r4, r2, r0)
            return r4
    }

    static <UT, UB> UB zza(int r5, java.util.List<java.lang.Integer> r6, com.google.android.gms.internal.drive.zzko r7, UB r8, com.google.android.gms.internal.drive.zzmx<UT, UB> r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r6.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r7.zzan(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r8 = zza(r5, r3, r8, r9)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r6.subList(r2, r0)
            r5.clear()
            goto L5e
        L3c:
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r7.zzan(r0)
            if (r1 != 0) goto L40
            java.lang.Object r8 = zza(r5, r0, r8, r9)
            r6.remove()
            goto L40
        L5e:
            return r8
    }

    public static void zza(int r1, java.util.List<java.lang.String> r2, com.google.android.gms.internal.drive.zzns r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zza(r1, r2)
        Lb:
            return
    }

    public static void zza(int r1, java.util.List<?> r2, com.google.android.gms.internal.drive.zzns r3, com.google.android.gms.internal.drive.zzmf r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zza(r1, r2, r4)
        Lb:
            return
    }

    public static void zza(int r1, java.util.List<java.lang.Double> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzg(r1, r2, r4)
        Lb:
            return
    }

    static <T, FT extends com.google.android.gms.internal.drive.zzkd<FT>> void zza(com.google.android.gms.internal.drive.zzjy<FT> r1, T r2, T r3) {
            com.google.android.gms.internal.drive.zzkb r3 = r1.zzb(r3)
            com.google.android.gms.internal.drive.zzmi<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>, java.lang.Object> r0 = r3.zzos
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            com.google.android.gms.internal.drive.zzkb r1 = r1.zzc(r2)
            r1.zza(r3)
        L13:
            return
    }

    static <T> void zza(com.google.android.gms.internal.drive.zzll r1, T r2, T r3, long r4) {
            java.lang.Object r0 = com.google.android.gms.internal.drive.zznd.zzo(r2, r4)
            java.lang.Object r3 = com.google.android.gms.internal.drive.zznd.zzo(r3, r4)
            java.lang.Object r1 = r1.zzb(r0, r3)
            com.google.android.gms.internal.drive.zznd.zza(r2, r4, r1)
            return
    }

    static <T, UT, UB> void zza(com.google.android.gms.internal.drive.zzmx<UT, UB> r1, T r2, T r3) {
            java.lang.Object r0 = r1.zzr(r2)
            java.lang.Object r3 = r1.zzr(r3)
            java.lang.Object r3 = r1.zzg(r0, r3)
            r1.zze(r2, r3)
            return
    }

    static int zzb(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.drive.zzle
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzle r5 = (com.google.android.gms.internal.drive.zzle) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzp(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzp(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static void zzb(int r1, java.util.List<com.google.android.gms.internal.drive.zzjc> r2, com.google.android.gms.internal.drive.zzns r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzb(r1, r2)
        Lb:
            return
    }

    public static void zzb(int r1, java.util.List<?> r2, com.google.android.gms.internal.drive.zzns r3, com.google.android.gms.internal.drive.zzmf r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzb(r1, r2, r4)
        Lb:
            return
    }

    public static void zzb(int r1, java.util.List<java.lang.Float> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzf(r1, r2, r4)
        Lb:
            return
    }

    static int zzc(int r1, java.lang.Object r2, com.google.android.gms.internal.drive.zzmf r3) {
            boolean r0 = r2 instanceof com.google.android.gms.internal.drive.zzkx
            if (r0 == 0) goto Lb
            com.google.android.gms.internal.drive.zzkx r2 = (com.google.android.gms.internal.drive.zzkx) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zza(r1, r2)
            return r1
        Lb:
            com.google.android.gms.internal.drive.zzlq r2 = (com.google.android.gms.internal.drive.zzlq) r2
            int r1 = com.google.android.gms.internal.drive.zzjr.zzb(r1, r2, r3)
            return r1
    }

    static int zzc(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = com.google.android.gms.internal.drive.zzjr.zzab(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof com.google.android.gms.internal.drive.zzkz
            if (r2 == 0) goto L2f
            com.google.android.gms.internal.drive.zzkz r5 = (com.google.android.gms.internal.drive.zzkz) r5
        L14:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r5.zzao(r1)
            boolean r3 = r2 instanceof com.google.android.gms.internal.drive.zzjc
            if (r3 == 0) goto L25
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzb(r2)
            goto L2b
        L25:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzm(r2)
        L2b:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L14
        L2f:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof com.google.android.gms.internal.drive.zzjc
            if (r3 == 0) goto L40
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzb(r2)
            goto L46
        L40:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzm(r2)
        L46:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L2f
        L4a:
            return r4
    }

    static int zzc(int r4, java.util.List<?> r5, com.google.android.gms.internal.drive.zzmf r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = com.google.android.gms.internal.drive.zzjr.zzab(r4)
            int r4 = r4 * r0
        Le:
            if (r1 >= r0) goto L29
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof com.google.android.gms.internal.drive.zzkx
            if (r3 == 0) goto L1f
            com.google.android.gms.internal.drive.zzkx r2 = (com.google.android.gms.internal.drive.zzkx) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zza(r2)
            goto L25
        L1f:
            com.google.android.gms.internal.drive.zzlq r2 = (com.google.android.gms.internal.drive.zzlq) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zza(r2, r6)
        L25:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto Le
        L29:
            return r4
    }

    static int zzc(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.drive.zzle
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzle r5 = (com.google.android.gms.internal.drive.zzle) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzq(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzq(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static void zzc(int r1, java.util.List<java.lang.Long> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzc(r1, r2, r4)
        Lb:
            return
    }

    static int zzd(int r2, java.util.List<com.google.android.gms.internal.drive.zzjc> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = com.google.android.gms.internal.drive.zzjr.zzab(r2)
            int r0 = r0 * r2
        Le:
            int r2 = r3.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r3.get(r1)
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            int r2 = com.google.android.gms.internal.drive.zzjr.zzb(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Le
        L22:
            return r0
    }

    static int zzd(int r4, java.util.List<com.google.android.gms.internal.drive.zzlq> r5, com.google.android.gms.internal.drive.zzmf r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 0
        L9:
            if (r1 >= r0) goto L19
            java.lang.Object r3 = r5.get(r1)
            com.google.android.gms.internal.drive.zzlq r3 = (com.google.android.gms.internal.drive.zzlq) r3
            int r3 = com.google.android.gms.internal.drive.zzjr.zzc(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L19:
            return r2
    }

    static int zzd(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzkl
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzkl r4 = (com.google.android.gms.internal.drive.zzkl) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzah(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzah(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static void zzd(int r1, java.util.List<java.lang.Long> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzd(r1, r2, r4)
        Lb:
            return
    }

    static boolean zzd(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    static int zze(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzkl
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzkl r4 = (com.google.android.gms.internal.drive.zzkl) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzac(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzac(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static void zze(int r1, java.util.List<java.lang.Long> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzn(r1, r2, r4)
        Lb:
            return
    }

    public static com.google.android.gms.internal.drive.zzmx<?, ?> zzem() {
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = com.google.android.gms.internal.drive.zzmh.zzva
            return r0
    }

    public static com.google.android.gms.internal.drive.zzmx<?, ?> zzen() {
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = com.google.android.gms.internal.drive.zzmh.zzvb
            return r0
    }

    public static com.google.android.gms.internal.drive.zzmx<?, ?> zzeo() {
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = com.google.android.gms.internal.drive.zzmh.zzvc
            return r0
    }

    private static java.lang.Class<?> zzep() {
            java.lang.String r0 = "com.google.protobuf.GeneratedMessage"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static java.lang.Class<?> zzeq() {
            java.lang.String r0 = "com.google.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    static int zzf(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzkl
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzkl r4 = (com.google.android.gms.internal.drive.zzkl) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzad(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzad(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    private static com.google.android.gms.internal.drive.zzmx<?, ?> zzf(boolean r6) {
            r0 = 0
            java.lang.Class r1 = zzeq()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L8
            return r0
        L8:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L23
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            r2[r5] = r6     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L23
            com.google.android.gms.internal.drive.zzmx r6 = (com.google.android.gms.internal.drive.zzmx) r6     // Catch: java.lang.Throwable -> L23
            return r6
        L23:
            return r0
    }

    public static void zzf(int r1, java.util.List<java.lang.Long> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zze(r1, r2, r4)
        Lb:
            return
    }

    static int zzg(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.drive.zzkl
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.drive.zzkl r4 = (com.google.android.gms.internal.drive.zzkl) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = com.google.android.gms.internal.drive.zzjr.zzae(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = com.google.android.gms.internal.drive.zzjr.zzae(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static void zzg(int r1, java.util.List<java.lang.Long> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzl(r1, r2, r4)
        Lb:
            return
    }

    public static void zzg(java.lang.Class<?> r1) {
            java.lang.Class<com.google.android.gms.internal.drive.zzkk> r0 = com.google.android.gms.internal.drive.zzkk.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class<?> r0 = com.google.android.gms.internal.drive.zzmh.zzuz
            if (r0 == 0) goto L1b
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    static int zzh(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 << 2
            return r0
    }

    public static void zzh(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zza(r1, r2, r4)
        Lb:
            return
    }

    static int zzi(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 << 3
            return r0
    }

    public static void zzi(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzj(r1, r2, r4)
        Lb:
            return
    }

    static int zzj(java.util.List<?> r0) {
            int r0 = r0.size()
            return r0
    }

    public static void zzj(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzm(r1, r2, r4)
        Lb:
            return
    }

    public static void zzk(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzb(r1, r2, r4)
        Lb:
            return
    }

    public static void zzl(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzk(r1, r2, r4)
        Lb:
            return
    }

    public static void zzm(int r1, java.util.List<java.lang.Integer> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzh(r1, r2, r4)
        Lb:
            return
    }

    public static void zzn(int r1, java.util.List<java.lang.Boolean> r2, com.google.android.gms.internal.drive.zzns r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzi(r1, r2, r4)
        Lb:
            return
    }

    static int zzo(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r2 = zza(r1)
            int r1 = r1.size()
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r1 = r1 * r0
            int r2 = r2 + r1
            return r2
    }

    static int zzp(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zzb(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzq(int r0, java.util.List<java.lang.Long> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zzc(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzr(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zzd(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzs(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zze(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzt(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zzf(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzu(int r0, java.util.List<java.lang.Integer> r1, boolean r2) {
            int r2 = r1.size()
            if (r2 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = zzg(r1)
            int r0 = com.google.android.gms.internal.drive.zzjr.zzab(r0)
            int r2 = r2 * r0
            int r1 = r1 + r2
            return r1
    }

    static int zzv(int r0, java.util.List<?> r1, boolean r2) {
            int r1 = r1.size()
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            int r0 = com.google.android.gms.internal.drive.zzjr.zzj(r0, r2)
            int r1 = r1 * r0
            return r1
    }

    static int zzw(int r2, java.util.List<?> r3, boolean r4) {
            int r3 = r3.size()
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 0
            int r2 = com.google.android.gms.internal.drive.zzjr.zzg(r2, r0)
            int r3 = r3 * r2
            return r3
    }

    static int zzx(int r0, java.util.List<?> r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r2 = 1
            int r0 = com.google.android.gms.internal.drive.zzjr.zzc(r0, r2)
            int r1 = r1 * r0
            return r1
    }
}
