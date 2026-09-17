package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlw<T> implements com.google.android.gms.internal.drive.zzmf<T> {
    private final com.google.android.gms.internal.drive.zzlq zzuh;
    private final boolean zzui;
    private final com.google.android.gms.internal.drive.zzmx<?, ?> zzur;
    private final com.google.android.gms.internal.drive.zzjy<?> zzus;

    private zzlw(com.google.android.gms.internal.drive.zzmx<?, ?> r1, com.google.android.gms.internal.drive.zzjy<?> r2, com.google.android.gms.internal.drive.zzlq r3) {
            r0 = this;
            r0.<init>()
            r0.zzur = r1
            boolean r1 = r2.zze(r3)
            r0.zzui = r1
            r0.zzus = r2
            r0.zzuh = r3
            return
    }

    static <T> com.google.android.gms.internal.drive.zzlw<T> zza(com.google.android.gms.internal.drive.zzmx<?, ?> r1, com.google.android.gms.internal.drive.zzjy<?> r2, com.google.android.gms.internal.drive.zzlq r3) {
            com.google.android.gms.internal.drive.zzlw r0 = new com.google.android.gms.internal.drive.zzlw
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean equals(T r3, T r4) {
            r2 = this;
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r2.zzur
            java.lang.Object r0 = r0.zzr(r3)
            com.google.android.gms.internal.drive.zzmx<?, ?> r1 = r2.zzur
            java.lang.Object r1 = r1.zzr(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.zzui
            if (r0 == 0) goto L29
            com.google.android.gms.internal.drive.zzjy<?> r0 = r2.zzus
            com.google.android.gms.internal.drive.zzkb r3 = r0.zzb(r3)
            com.google.android.gms.internal.drive.zzjy<?> r0 = r2.zzus
            com.google.android.gms.internal.drive.zzkb r4 = r0.zzb(r4)
            boolean r3 = r3.equals(r4)
            return r3
        L29:
            r3 = 1
            return r3
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r2.zzur
            java.lang.Object r0 = r0.zzr(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.zzui
            if (r1 == 0) goto L1b
            com.google.android.gms.internal.drive.zzjy<?> r1 = r2.zzus
            com.google.android.gms.internal.drive.zzkb r3 = r1.zzb(r3)
            int r0 = r0 * 53
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1b:
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
            r1 = this;
            com.google.android.gms.internal.drive.zzlq r0 = r1.zzuh
            com.google.android.gms.internal.drive.zzlr r0 = r0.zzcz()
            com.google.android.gms.internal.drive.zzlq r0 = r0.zzde()
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T r6, com.google.android.gms.internal.drive.zzns r7) throws java.io.IOException {
            r5 = this;
            com.google.android.gms.internal.drive.zzjy<?> r0 = r5.zzus
            com.google.android.gms.internal.drive.zzkb r0 = r0.zzb(r6)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.drive.zzkd r2 = (com.google.android.gms.internal.drive.zzkd) r2
            com.google.android.gms.internal.drive.zznr r3 = r2.zzcr()
            com.google.android.gms.internal.drive.zznr r4 = com.google.android.gms.internal.drive.zznr.zzxx
            if (r3 != r4) goto L52
            boolean r3 = r2.zzcs()
            if (r3 != 0) goto L52
            boolean r3 = r2.zzct()
            if (r3 != 0) goto L52
            boolean r3 = r1 instanceof com.google.android.gms.internal.drive.zzkv
            if (r3 == 0) goto L46
            int r2 = r2.zzcp()
            com.google.android.gms.internal.drive.zzkv r1 = (com.google.android.gms.internal.drive.zzkv) r1
            com.google.android.gms.internal.drive.zzkt r1 = r1.zzdq()
            com.google.android.gms.internal.drive.zzjc r1 = r1.zzbl()
            r7.zza(r2, r1)
            goto La
        L46:
            int r2 = r2.zzcp()
            java.lang.Object r1 = r1.getValue()
            r7.zza(r2, r1)
            goto La
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L5a:
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r5.zzur
            java.lang.Object r6 = r0.zzr(r6)
            r0.zzc(r6, r7)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zza(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.drive.zziz r14) throws java.io.IOException {
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            com.google.android.gms.internal.drive.zzmy r1 = r0.zzrq
            com.google.android.gms.internal.drive.zzmy r2 = com.google.android.gms.internal.drive.zzmy.zzfa()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.drive.zzmy r1 = com.google.android.gms.internal.drive.zzmy.zzfb()
            r0.zzrq = r1
        L11:
            com.google.android.gms.internal.drive.zzkk$zzc r10 = (com.google.android.gms.internal.drive.zzkk.zzc) r10
            r10.zzdg()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = com.google.android.gms.internal.drive.zziy.zza(r11, r12, r14)
            int r2 = r14.zznk
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            com.google.android.gms.internal.drive.zzjy<?> r12 = r9.zzus
            com.google.android.gms.internal.drive.zzjx r0 = r14.zznn
            com.google.android.gms.internal.drive.zzlq r3 = r9.zzuh
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.zza(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.drive.zzkk$zzd r0 = (com.google.android.gms.internal.drive.zzkk.zzd) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.drive.zziy.zza(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            com.google.android.gms.internal.drive.zzmd.zzej()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = com.google.android.gms.internal.drive.zziy.zza(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = com.google.android.gms.internal.drive.zziy.zza(r11, r4, r14)
            int r5 = r14.zznk
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = com.google.android.gms.internal.drive.zziy.zze(r11, r4, r14)
            java.lang.Object r2 = r14.zznm
            com.google.android.gms.internal.drive.zzjc r2 = (com.google.android.gms.internal.drive.zzjc) r2
            goto L53
        L72:
            com.google.android.gms.internal.drive.zzmd.zzej()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = com.google.android.gms.internal.drive.zziy.zza(r11, r4, r14)
            int r12 = r14.zznk
            com.google.android.gms.internal.drive.zzjy<?> r0 = r9.zzus
            com.google.android.gms.internal.drive.zzjx r5 = r14.zznn
            com.google.android.gms.internal.drive.zzlq r6 = r9.zzuh
            java.lang.Object r0 = r0.zza(r5, r6, r12)
            com.google.android.gms.internal.drive.zzkk$zzd r0 = (com.google.android.gms.internal.drive.zzkk.zzd) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = com.google.android.gms.internal.drive.zziy.zza(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.zzb(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.drive.zzkq r10 = com.google.android.gms.internal.drive.zzkq.zzdm()
            throw r10
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T r2, T r3) {
            r1 = this;
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r1.zzur
            com.google.android.gms.internal.drive.zzmh.zza(r0, r2, r3)
            boolean r0 = r1.zzui
            if (r0 == 0) goto Le
            com.google.android.gms.internal.drive.zzjy<?> r0 = r1.zzus
            com.google.android.gms.internal.drive.zzmh.zza(r0, r2, r3)
        Le:
            return
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r1.zzur
            r0.zzd(r2)
            com.google.android.gms.internal.drive.zzjy<?> r0 = r1.zzus
            r0.zzd(r2)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T r3) {
            r2 = this;
            com.google.android.gms.internal.drive.zzmx<?, ?> r0 = r2.zzur
            java.lang.Object r1 = r0.zzr(r3)
            int r0 = r0.zzs(r1)
            int r0 = r0 + 0
            boolean r1 = r2.zzui
            if (r1 == 0) goto L1b
            com.google.android.gms.internal.drive.zzjy<?> r1 = r2.zzus
            com.google.android.gms.internal.drive.zzkb r3 = r1.zzb(r3)
            int r3 = r3.zzco()
            int r0 = r0 + r3
        L1b:
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T r2) {
            r1 = this;
            com.google.android.gms.internal.drive.zzjy<?> r0 = r1.zzus
            com.google.android.gms.internal.drive.zzkb r2 = r0.zzb(r2)
            boolean r2 = r2.isInitialized()
            return r2
    }
}
