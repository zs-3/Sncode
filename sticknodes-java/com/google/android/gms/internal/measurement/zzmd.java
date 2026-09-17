package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzmd<MessageType extends com.google.android.gms.internal.measurement.zzmd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzlz<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType> {
    private static final java.util.Map zzb = null;
    protected com.google.android.gms.internal.measurement.zzof zzc;
    private int zzd;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.measurement.zzmd.zzb = r0
            return
    }

    public zzmd() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.zzd = r0
            com.google.android.gms.internal.measurement.zzof r0 = com.google.android.gms.internal.measurement.zzof.zzc()
            r1.zzc = r0
            return
    }

    private final int zzc(com.google.android.gms.internal.measurement.zzns r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zznp r2 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r0 = r1.getClass()
            com.google.android.gms.internal.measurement.zzns r2 = r2.zzb(r0)
            int r2 = r2.zza(r1)
            return r2
    }

    static com.google.android.gms.internal.measurement.zzmd zzci(java.lang.Class r4) {
            java.util.Map r0 = com.google.android.gms.internal.measurement.zzmd.zzb
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzmd r1 = (com.google.android.gms.internal.measurement.zzmd) r1
            if (r1 != 0) goto L26
            java.lang.String r1 = r4.getName()     // Catch: java.lang.ClassNotFoundException -> L1d
            r2 = 1
            java.lang.ClassLoader r3 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r1 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzmd r1 = (com.google.android.gms.internal.measurement.zzmd) r1
            goto L26
        L1d:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r4)
            throw r0
        L26:
            if (r1 != 0) goto L42
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzol.zze(r4)
            com.google.android.gms.internal.measurement.zzmd r1 = (com.google.android.gms.internal.measurement.zzmd) r1
            r2 = 6
            r3 = 0
            java.lang.Object r1 = r1.zzl(r2, r3, r3)
            com.google.android.gms.internal.measurement.zzmd r1 = (com.google.android.gms.internal.measurement.zzmd) r1
            if (r1 == 0) goto L3c
            r0.put(r4, r1)
            goto L42
        L3c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L42:
            return r1
    }

    protected static com.google.android.gms.internal.measurement.zzmh zzck() {
            com.google.android.gms.internal.measurement.zzme r0 = com.google.android.gms.internal.measurement.zzme.zzf()
            return r0
    }

    protected static com.google.android.gms.internal.measurement.zzmi zzcl() {
            com.google.android.gms.internal.measurement.zzmw r0 = com.google.android.gms.internal.measurement.zzmw.zzf()
            return r0
    }

    protected static com.google.android.gms.internal.measurement.zzmi zzcm(com.google.android.gms.internal.measurement.zzmi r1) {
            int r0 = r1.size()
            int r0 = r0 + r0
            com.google.android.gms.internal.measurement.zzmi r1 = r1.zze(r0)
            return r1
    }

    protected static com.google.android.gms.internal.measurement.zzmj zzcn() {
            com.google.android.gms.internal.measurement.zznq r0 = com.google.android.gms.internal.measurement.zznq.zze()
            return r0
    }

    protected static com.google.android.gms.internal.measurement.zzmj zzco(com.google.android.gms.internal.measurement.zzmj r1) {
            int r0 = r1.size()
            int r0 = r0 + r0
            com.google.android.gms.internal.measurement.zzmj r1 = r1.zzd(r0)
            return r1
    }

    static java.lang.Object zzcp(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static java.lang.Object zzcq(com.google.android.gms.internal.measurement.zznh r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.measurement.zznr r0 = new com.google.android.gms.internal.measurement.zznr
            r0.<init>(r1, r2, r3)
            return r0
    }

    protected static void zzct(java.lang.Class r1, com.google.android.gms.internal.measurement.zzmd r2) {
            r2.zzcs()
            java.util.Map r0 = com.google.android.gms.internal.measurement.zzmd.zzb
            r0.put(r1, r2)
            return
    }

    static /* bridge */ /* synthetic */ boolean zzcv(com.google.android.gms.internal.measurement.zzmd r0, boolean r1) {
            r1 = 0
            boolean r0 = zzd(r0, r1)
            return r0
    }

    private static final boolean zzd(com.google.android.gms.internal.measurement.zzmd r4, boolean r5) {
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r4.zzl(r0, r1, r1)
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            if (r2 != r0) goto Lf
            return r0
        Lf:
            if (r2 != 0) goto L13
            r4 = 0
            return r4
        L13:
            com.google.android.gms.internal.measurement.zznp r2 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r3 = r4.getClass()
            com.google.android.gms.internal.measurement.zzns r2 = r2.zzb(r3)
            boolean r2 = r2.zzk(r4)
            if (r5 == 0) goto L2e
            if (r0 == r2) goto L29
            r5 = r1
            goto L2a
        L29:
            r5 = r4
        L2a:
            r0 = 2
            r4.zzl(r0, r5, r1)
        L2e:
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            java.lang.Class r0 = r3.getClass()
            com.google.android.gms.internal.measurement.zznp r1 = com.google.android.gms.internal.measurement.zznp.zza()
            com.google.android.gms.internal.measurement.zzns r0 = r1.zzb(r0)
            com.google.android.gms.internal.measurement.zzmd r4 = (com.google.android.gms.internal.measurement.zzmd) r4
            boolean r4 = r0.zzj(r3, r4)
            return r4
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.zzcw()
            if (r0 != 0) goto L11
            int r0 = r1.zza
            if (r0 != 0) goto L10
            int r0 = r1.zzce()
            r1.zza = r0
        L10:
            return r0
        L11:
            int r0 = r1.zzce()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.measurement.zznj.zza(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzcA() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzl(r0, r1, r1)
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final void zzcB(com.google.android.gms.internal.measurement.zzlk r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.measurement.zznp r0 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.measurement.zzns r0 = r0.zzb(r1)
            com.google.android.gms.internal.measurement.zzll r3 = com.google.android.gms.internal.measurement.zzll.zza(r3)
            r0.zzi(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* synthetic */ com.google.android.gms.internal.measurement.zznh zzcC() {
            r2 = this;
            r0 = 6
            r1 = 0
            java.lang.Object r0 = r2.zzl(r0, r1, r1)
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
            r1 = this;
            r0 = 1
            boolean r0 = zzd(r1, r0)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    final int zzca(com.google.android.gms.internal.measurement.zzns r4) {
            r3 = this;
            boolean r0 = r3.zzcw()
            java.lang.String r1 = "serialized size must be non-negative, was "
            if (r0 == 0) goto L24
            int r4 = r4.zza(r3)
            if (r4 < 0) goto Lf
            return r4
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L24:
            int r0 = r3.zzd
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            if (r0 != r2) goto L50
            int r4 = r4.zza(r3)
            if (r4 < 0) goto L3b
            int r0 = r3.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            r0 = r0 | r4
            r3.zzd = r0
            return r4
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L50:
            return r0
    }

    final int zzce() {
            r2 = this;
            com.google.android.gms.internal.measurement.zznp r0 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.measurement.zzns r0 = r0.zzb(r1)
            int r0 = r0.zzb(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final int zzcf() {
            r4 = this;
            boolean r0 = r4.zzcw()
            java.lang.String r1 = "serialized size must be non-negative, was "
            r2 = 0
            if (r0 == 0) goto L25
            int r0 = r4.zzc(r2)
            if (r0 < 0) goto L10
            goto L3c
        L10:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L25:
            int r0 = r4.zzd
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r3
            if (r0 == r3) goto L2e
            goto L3c
        L2e:
            int r0 = r4.zzc(r2)
            if (r0 < 0) goto L3d
            int r1 = r4.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            r1 = r1 | r0
            r4.zzd = r1
        L3c:
            return r0
        L3d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
    }

    protected final com.google.android.gms.internal.measurement.zzlz zzcg() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzl(r0, r1, r1)
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzlz zzch() {
            r2 = this;
            r0 = 5
            r1 = 0
            java.lang.Object r0 = r2.zzl(r0, r1, r1)
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            r0.zzaY(r2)
            return r0
    }

    final com.google.android.gms.internal.measurement.zzmd zzcj() {
            r2 = this;
            r0 = 4
            r1 = 0
            java.lang.Object r0 = r2.zzl(r0, r1, r1)
            com.google.android.gms.internal.measurement.zzmd r0 = (com.google.android.gms.internal.measurement.zzmd) r0
            return r0
    }

    protected final void zzcr() {
            r2 = this;
            com.google.android.gms.internal.measurement.zznp r0 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.measurement.zzns r0 = r0.zzb(r1)
            r0.zzf(r2)
            r2.zzcs()
            return
    }

    final void zzcs() {
            r2 = this;
            int r0 = r2.zzd
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2.zzd = r0
            return
    }

    final void zzcu(int r2) {
            r1 = this;
            int r2 = r1.zzd
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 | r0
            r1.zzd = r2
            return
    }

    final boolean zzcw() {
            r2 = this;
            int r0 = r2.zzd
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected abstract java.lang.Object zzl(int r1, java.lang.Object r2, java.lang.Object r3);
}
