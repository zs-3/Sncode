package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlm implements com.google.android.gms.internal.drive.zzll {
    zzlm() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final int zzb(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            com.google.android.gms.internal.drive.zzlk r2 = (com.google.android.gms.internal.drive.zzlk) r2
            boolean r1 = r2.isEmpty()
            r3 = 0
            if (r1 == 0) goto La
            return r3
        La:
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L19
            return r3
        L19:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getKey()
            r1.getValue()
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzb(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.gms.internal.drive.zzlk r2 = (com.google.android.gms.internal.drive.zzlk) r2
            com.google.android.gms.internal.drive.zzlk r3 = (com.google.android.gms.internal.drive.zzlk) r3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L17
            boolean r0 = r2.isMutable()
            if (r0 != 0) goto L14
            com.google.android.gms.internal.drive.zzlk r2 = r2.zzdx()
        L14:
            r2.zza(r3)
        L17:
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.util.Map<?, ?> zzh(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzlk r1 = (com.google.android.gms.internal.drive.zzlk) r1
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.util.Map<?, ?> zzi(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzlk r1 = (com.google.android.gms.internal.drive.zzlk) r1
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final boolean zzj(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzlk r1 = (com.google.android.gms.internal.drive.zzlk) r1
            boolean r1 = r1.isMutable()
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzk(java.lang.Object r2) {
            r1 = this;
            r0 = r2
            com.google.android.gms.internal.drive.zzlk r0 = (com.google.android.gms.internal.drive.zzlk) r0
            r0.zzbp()
            return r2
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final java.lang.Object zzl(java.lang.Object r1) {
            r0 = this;
            com.google.android.gms.internal.drive.zzlk r1 = com.google.android.gms.internal.drive.zzlk.zzdw()
            com.google.android.gms.internal.drive.zzlk r1 = r1.zzdx()
            return r1
    }

    @Override // com.google.android.gms.internal.drive.zzll
    public final com.google.android.gms.internal.drive.zzlj<?, ?> zzm(java.lang.Object r1) {
            r0 = this;
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
    }
}
