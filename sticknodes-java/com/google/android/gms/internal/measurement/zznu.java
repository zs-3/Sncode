package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.measurement.zzoe zzb = null;

    static {
            int r0 = com.google.android.gms.internal.measurement.zznp.zza
            com.google.android.gms.internal.measurement.zzog r0 = new com.google.android.gms.internal.measurement.zzog
            r0.<init>()
            com.google.android.gms.internal.measurement.zznu.zzb = r0
            return
    }

    public static void zzA(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzC(r1, r2, r4)
        Lb:
            return
    }

    public static void zzB(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzE(r1, r2, r4)
        Lb:
            return
    }

    public static void zzC(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzJ(r1, r2, r4)
        Lb:
            return
    }

    public static void zzD(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzL(r1, r2, r4)
        Lb:
            return
    }

    static boolean zzE(java.lang.Object r2, java.lang.Object r3) {
            r0 = 0
            r1 = 1
            if (r2 == r3) goto Le
            if (r2 == 0) goto Lf
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Ld
            goto Le
        Ld:
            return r0
        Le:
            r0 = 1
        Lf:
            return r0
    }

    static int zza(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzme
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.measurement.zzme r5 = (com.google.android.gms.internal.measurement.zzme) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L34
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            r2 = 0
        L1f:
            if (r1 >= r0) goto L34
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L34:
            return r2
    }

    static int zzb(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.measurement.zzlk.zzz(r0)
            int r0 = r0 + 4
            int r1 = r1 * r0
            return r1
    }

    static int zzc(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    static int zzd(int r0, java.util.List r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r0 << 3
            int r0 = com.google.android.gms.internal.measurement.zzlk.zzz(r0)
            int r0 = r0 + 8
            int r1 = r1 * r0
            return r1
    }

    static int zze(java.util.List r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    static int zzf(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzme
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.measurement.zzme r5 = (com.google.android.gms.internal.measurement.zzme) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L34
            int r3 = r5.zze(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1e:
            r2 = 0
        L1f:
            if (r1 >= r0) goto L34
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1f
        L34:
            return r2
    }

    static int zzg(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzmw
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.measurement.zzmw r5 = (com.google.android.gms.internal.measurement.zzmw) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
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
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int zzh(int r1, java.lang.Object r2, com.google.android.gms.internal.measurement.zzns r3) {
            int r1 = r1 << 3
            boolean r0 = r2 instanceof com.google.android.gms.internal.measurement.zzms
            if (r0 == 0) goto L17
            com.google.android.gms.internal.measurement.zzms r2 = (com.google.android.gms.internal.measurement.zzms) r2
            int r1 = com.google.android.gms.internal.measurement.zzlk.zzz(r1)
            int r2 = r2.zza()
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r2)
            int r3 = r3 + r2
            int r1 = r1 + r3
            return r1
        L17:
            com.google.android.gms.internal.measurement.zznh r2 = (com.google.android.gms.internal.measurement.zznh) r2
            int r1 = com.google.android.gms.internal.measurement.zzlk.zzz(r1)
            int r2 = com.google.android.gms.internal.measurement.zzlk.zzx(r2, r3)
            int r1 = r1 + r2
            return r1
    }

    static int zzi(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzme
            if (r2 == 0) goto L22
            com.google.android.gms.internal.measurement.zzme r5 = (com.google.android.gms.internal.measurement.zzme) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L3c
            int r3 = r5.zze(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L22:
            r2 = 0
        L23:
            if (r1 >= r0) goto L3c
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L23
        L3c:
            return r2
    }

    static int zzj(java.util.List r8) {
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r8 instanceof com.google.android.gms.internal.measurement.zzmw
            r3 = 63
            if (r2 == 0) goto L23
            com.google.android.gms.internal.measurement.zzmw r8 = (com.google.android.gms.internal.measurement.zzmw) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L3c
            long r4 = r8.zza(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzlk.zzA(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L11
        L23:
            r2 = 0
        L24:
            if (r1 >= r0) goto L3c
            java.lang.Object r4 = r8.get(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzlk.zzA(r4)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L24
        L3c:
            return r2
    }

    static int zzk(java.util.List r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof com.google.android.gms.internal.measurement.zzme
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.measurement.zzme r4 = (com.google.android.gms.internal.measurement.zzme) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.zze(r1)
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
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
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzz(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int zzl(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zzmw
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.measurement.zzmw r5 = (com.google.android.gms.internal.measurement.zzmw) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
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
            int r3 = com.google.android.gms.internal.measurement.zzlk.zzA(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static com.google.android.gms.internal.measurement.zzoe zzm() {
            com.google.android.gms.internal.measurement.zzoe r0 = com.google.android.gms.internal.measurement.zznu.zzb
            return r0
    }

    static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.measurement.zzoe r6) {
            if (r5 != 0) goto L12
            com.google.android.gms.internal.measurement.zzmd r2 = (com.google.android.gms.internal.measurement.zzmd) r2
            com.google.android.gms.internal.measurement.zzof r5 = r2.zzc
            com.google.android.gms.internal.measurement.zzof r6 = com.google.android.gms.internal.measurement.zzof.zzc()
            if (r5 != r6) goto L12
            com.google.android.gms.internal.measurement.zzof r5 = com.google.android.gms.internal.measurement.zzof.zzf()
            r2.zzc = r5
        L12:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.measurement.zzof r3 = (com.google.android.gms.internal.measurement.zzof) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
    }

    static void zzo(com.google.android.gms.internal.measurement.zzlq r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.android.gms.internal.measurement.zzma r2 = (com.google.android.gms.internal.measurement.zzma) r2
            com.google.android.gms.internal.measurement.zzlu r0 = r2.zzb
            com.google.android.gms.internal.measurement.zzoa r0 = r0.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.gms.internal.measurement.zzma r1 = (com.google.android.gms.internal.measurement.zzma) r1
            r0 = 0
            throw r0
    }

    static void zzp(com.google.android.gms.internal.measurement.zzoe r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.measurement.zzmd r2 = (com.google.android.gms.internal.measurement.zzmd) r2
            com.google.android.gms.internal.measurement.zzof r1 = r2.zzc
            com.google.android.gms.internal.measurement.zzmd r3 = (com.google.android.gms.internal.measurement.zzmd) r3
            com.google.android.gms.internal.measurement.zzof r3 = r3.zzc
            com.google.android.gms.internal.measurement.zzof r0 = com.google.android.gms.internal.measurement.zzof.zzc()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            com.google.android.gms.internal.measurement.zzof r0 = com.google.android.gms.internal.measurement.zzof.zzc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.measurement.zzof r1 = com.google.android.gms.internal.measurement.zzof.zze(r1, r3)
            goto L24
        L21:
            r1.zzd(r3)
        L24:
            r2.zzc = r1
            return
    }

    public static void zzq(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzc(r1, r2, r4)
        Lb:
            return
    }

    public static void zzr(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzg(r1, r2, r4)
        Lb:
            return
    }

    public static void zzs(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzj(r1, r2, r4)
        Lb:
            return
    }

    public static void zzt(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzl(r1, r2, r4)
        Lb:
            return
    }

    public static void zzu(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzn(r1, r2, r4)
        Lb:
            return
    }

    public static void zzv(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzp(r1, r2, r4)
        Lb:
            return
    }

    public static void zzw(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzs(r1, r2, r4)
        Lb:
            return
    }

    public static void zzx(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzu(r1, r2, r4)
        Lb:
            return
    }

    public static void zzy(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzy(r1, r2, r4)
        Lb:
            return
    }

    public static void zzz(int r1, java.util.List r2, com.google.android.gms.internal.measurement.zzor r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzA(r1, r2, r4)
        Lb:
            return
    }
}
