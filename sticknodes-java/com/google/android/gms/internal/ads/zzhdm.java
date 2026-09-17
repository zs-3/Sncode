package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhdm {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.internal.ads.zzhdy zzb = null;

    static {
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhea r0 = new com.google.android.gms.internal.ads.zzhea
            r0.<init>()
            com.google.android.gms.internal.ads.zzhdm.zzb = r0
            return
    }

    public static void zzA(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzu(r1, r2, r4)
        Lb:
            return
    }

    public static void zzB(int r3, java.util.List r4, com.google.android.gms.internal.ads.zzhen r5, com.google.android.gms.internal.ads.zzhdk r6) throws java.io.IOException {
            if (r4 == 0) goto L1c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1c
            r0 = 0
        L9:
            int r1 = r4.size()
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = r4.get(r0)
            r2 = r5
            com.google.android.gms.internal.ads.zzhak r2 = (com.google.android.gms.internal.ads.zzhak) r2
            r2.zzv(r3, r1, r6)
            int r0 = r0 + 1
            goto L9
        L1c:
            return
    }

    public static void zzC(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzy(r1, r2, r4)
        Lb:
            return
    }

    public static void zzD(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzA(r1, r2, r4)
        Lb:
            return
    }

    public static void zzE(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzC(r1, r2, r4)
        Lb:
            return
    }

    public static void zzF(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzE(r1, r2, r4)
        Lb:
            return
    }

    public static void zzG(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzH(r1, r2)
        Lb:
            return
    }

    public static void zzH(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzJ(r1, r2, r4)
        Lb:
            return
    }

    public static void zzI(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzL(r1, r2, r4)
        Lb:
            return
    }

    static boolean zzJ(java.lang.Object r2, java.lang.Object r3) {
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L34
            int r3 = r5.zzd(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
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
            int r0 = com.google.android.gms.internal.ads.zzhaj.zzD(r0)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L34
            int r3 = r5.zzd(r1)
            long r3 = (long) r3
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int zzh(int r1, java.lang.Object r2, com.google.android.gms.internal.ads.zzhdk r3) {
            int r1 = r1 << 3
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzhca
            if (r0 == 0) goto L17
            com.google.android.gms.internal.ads.zzhca r2 = (com.google.android.gms.internal.ads.zzhca) r2
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzD(r1)
            int r2 = r2.zza()
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r2)
            int r3 = r3 + r2
            int r1 = r1 + r3
            return r1
        L17:
            com.google.android.gms.internal.ads.zzhcp r2 = (com.google.android.gms.internal.ads.zzhcp) r2
            int r1 = com.google.android.gms.internal.ads.zzhaj.zzD(r1)
            int r2 = com.google.android.gms.internal.ads.zzhaj.zzA(r2, r3)
            int r1 = r1 + r2
            return r1
    }

    static int zzi(java.util.List r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhbf
            if (r2 == 0) goto L22
            com.google.android.gms.internal.ads.zzhbf r5 = (com.google.android.gms.internal.ads.zzhbf) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L3c
            int r3 = r5.zzd(r1)
            int r4 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r4
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
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
            boolean r2 = r8 instanceof com.google.android.gms.internal.ads.zzhce
            r3 = 63
            if (r2 == 0) goto L23
            com.google.android.gms.internal.ads.zzhce r8 = (com.google.android.gms.internal.ads.zzhce) r8
            r2 = 0
        L11:
            if (r1 >= r0) goto L3c
            long r4 = r8.zza(r1)
            long r6 = r4 + r4
            long r4 = r4 >> r3
            long r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzE(r4)
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
            int r4 = com.google.android.gms.internal.ads.zzhaj.zzE(r4)
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
            boolean r2 = r4 instanceof com.google.android.gms.internal.ads.zzhbf
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.ads.zzhbf r4 = (com.google.android.gms.internal.ads.zzhbf) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.zzd(r1)
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzD(r3)
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
            boolean r2 = r5 instanceof com.google.android.gms.internal.ads.zzhce
            if (r2 == 0) goto L1d
            com.google.android.gms.internal.ads.zzhce r5 = (com.google.android.gms.internal.ads.zzhce) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.zza(r1)
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
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
            int r3 = com.google.android.gms.internal.ads.zzhaj.zzE(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    public static com.google.android.gms.internal.ads.zzhdy zzm() {
            com.google.android.gms.internal.ads.zzhdy r0 = com.google.android.gms.internal.ads.zzhdm.zzb
            return r0
    }

    static java.lang.Object zzn(java.lang.Object r5, int r6, java.util.List r7, com.google.android.gms.internal.ads.zzhbk r8, java.lang.Object r9, com.google.android.gms.internal.ads.zzhdy r10) {
            if (r8 != 0) goto L3
            return r9
        L3:
            boolean r0 = r7 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r7.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r8.zza(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r9 = zzo(r5, r6, r3, r9, r10)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r7.subList(r2, r0)
            r5.clear()
            return r9
        L3c:
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r8.zza(r0)
            if (r1 != 0) goto L40
            java.lang.Object r9 = zzo(r5, r6, r0, r9, r10)
            r7.remove()
            goto L40
        L5e:
            return r9
    }

    static java.lang.Object zzo(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.ads.zzhdy r6) {
            if (r5 != 0) goto L6
            java.lang.Object r5 = r6.zza(r2)
        L6:
            long r0 = (long) r4
            r6.zzh(r5, r3, r0)
            return r5
    }

    static void zzp(com.google.android.gms.internal.ads.zzhap r0, java.lang.Object r1, java.lang.Object r2) {
            com.google.android.gms.internal.ads.zzhba r2 = (com.google.android.gms.internal.ads.zzhba) r2
            com.google.android.gms.internal.ads.zzhat r0 = r2.zza
            com.google.android.gms.internal.ads.zzhdu r0 = r0.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            com.google.android.gms.internal.ads.zzhba r1 = (com.google.android.gms.internal.ads.zzhba) r1
            r0 = 0
            throw r0
    }

    static void zzq(com.google.android.gms.internal.ads.zzhdy r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.ads.zzhbe r2 = (com.google.android.gms.internal.ads.zzhbe) r2
            com.google.android.gms.internal.ads.zzhdz r1 = r2.zzt
            com.google.android.gms.internal.ads.zzhbe r3 = (com.google.android.gms.internal.ads.zzhbe) r3
            com.google.android.gms.internal.ads.zzhdz r3 = r3.zzt
            com.google.android.gms.internal.ads.zzhdz r0 = com.google.android.gms.internal.ads.zzhdz.zzc()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L24
            com.google.android.gms.internal.ads.zzhdz r0 = com.google.android.gms.internal.ads.zzhdz.zzc()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            com.google.android.gms.internal.ads.zzhdz r1 = com.google.android.gms.internal.ads.zzhdz.zze(r1, r3)
            goto L24
        L21:
            r1.zzd(r3)
        L24:
            r2.zzt = r1
            return
    }

    public static void zzr(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzc(r1, r2, r4)
        Lb:
            return
    }

    public static void zzs(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zze(r1, r2)
        Lb:
            return
    }

    public static void zzt(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzg(r1, r2, r4)
        Lb:
            return
    }

    public static void zzu(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzj(r1, r2, r4)
        Lb:
            return
    }

    public static void zzv(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzl(r1, r2, r4)
        Lb:
            return
    }

    public static void zzw(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzn(r1, r2, r4)
        Lb:
            return
    }

    public static void zzx(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzp(r1, r2, r4)
        Lb:
            return
    }

    public static void zzy(int r3, java.util.List r4, com.google.android.gms.internal.ads.zzhen r5, com.google.android.gms.internal.ads.zzhdk r6) throws java.io.IOException {
            if (r4 == 0) goto L1c
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1c
            r0 = 0
        L9:
            int r1 = r4.size()
            if (r0 >= r1) goto L1c
            java.lang.Object r1 = r4.get(r0)
            r2 = r5
            com.google.android.gms.internal.ads.zzhak r2 = (com.google.android.gms.internal.ads.zzhak) r2
            r2.zzq(r3, r1, r6)
            int r0 = r0 + 1
            goto L9
        L1c:
            return
    }

    public static void zzz(int r1, java.util.List r2, com.google.android.gms.internal.ads.zzhen r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.zzs(r1, r2, r4)
        Lb:
            return
    }
}
