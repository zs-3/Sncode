package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhay;
import com.google.android.gms.internal.ads.zzhbe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public class zzhay<MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzhay<MessageType, BuilderType>> extends com.google.android.gms.internal.ads.zzgza<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzhay(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            boolean r2 = r2.zzcf()
            if (r2 != 0) goto L12
            com.google.android.gms.internal.ads.zzhbe r2 = r1.zza()
            r1.zza = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Default instance must be immutable."
            r2.<init>(r0)
            throw r2
    }

    private MessageType zza() {
            r1 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zzb
            com.google.android.gms.internal.ads.zzhbe r0 = r0.zzbj()
            return r0
    }

    private static <MessageType> void zzb(MessageType r2, MessageType r3) {
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)
            r0.zzg(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzbh()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgza zzaC() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzbh()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    protected /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgza zzaD(com.google.android.gms.internal.ads.zzgzb r1) {
            r0 = this;
            com.google.android.gms.internal.ads.zzhbe r1 = (com.google.android.gms.internal.ads.zzhbe) r1
            r0.zzbi(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgza zzaK(com.google.android.gms.internal.ads.zzhac r1, com.google.android.gms.internal.ads.zzhao r2) throws java.io.IOException {
            r0 = this;
            r0.zzbk(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgza zzaN(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzbl(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzgza zzaO(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzbm(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaP() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhay r0 = r1.zzbh()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaW(com.google.android.gms.internal.ads.zzhac r1, com.google.android.gms.internal.ads.zzhao r2) throws java.io.IOException {
            r0 = this;
            r0.zzbk(r1, r2)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzaZ(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzbl(r1, r2, r3)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzba(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzhao r4) throws com.google.android.gms.internal.ads.zzhbt {
            r0 = this;
            r0.zzbm(r1, r2, r3, r4)
            return r0
    }

    public final BuilderType zzbg() {
            r2 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r2.zzb
            boolean r0 = r0.zzcf()
            if (r0 != 0) goto Lf
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zza()
            r2.zza = r0
            return r2
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Default instance must be immutable."
            r0.<init>(r1)
            throw r0
    }

    public BuilderType zzbh() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zzbp()
            com.google.android.gms.internal.ads.zzhay r0 = r0.zzbb()
            com.google.android.gms.internal.ads.zzhbe r1 = r2.zzbo()
            r0.zza = r1
            return r0
    }

    protected BuilderType zzbi(MessageType r1) {
            r0 = this;
            r0.zzbj(r1)
            return r0
    }

    public BuilderType zzbj(MessageType r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r1.zzbp()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            r1.zzbu()
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            zzb(r0, r2)
            return r1
    }

    public BuilderType zzbk(com.google.android.gms.internal.ads.zzhac r3, com.google.android.gms.internal.ads.zzhao r4) throws java.io.IOException {
            r2 = this;
            r2.zzbu()
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()     // Catch: java.lang.RuntimeException -> L1b
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r1 = r2.zza     // Catch: java.lang.RuntimeException -> L1b
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.RuntimeException -> L1b
            com.google.android.gms.internal.ads.zzhdk r0 = r0.zzb(r1)     // Catch: java.lang.RuntimeException -> L1b
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r1 = r2.zza     // Catch: java.lang.RuntimeException -> L1b
            com.google.android.gms.internal.ads.zzhad r3 = com.google.android.gms.internal.ads.zzhad.zzq(r3)     // Catch: java.lang.RuntimeException -> L1b
            r0.zzh(r1, r3, r4)     // Catch: java.lang.RuntimeException -> L1b
            return r2
        L1b:
            r3 = move-exception
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof java.io.IOException
            if (r4 == 0) goto L2b
            java.lang.Throwable r3 = r3.getCause()
            java.io.IOException r3 = (java.io.IOException) r3
            throw r3
        L2b:
            throw r3
    }

    public BuilderType zzbl(byte[] r2, int r3, int r4) throws com.google.android.gms.internal.ads.zzhbt {
            r1 = this;
            int r0 = com.google.android.gms.internal.ads.zzhao.zzb
            int r0 = com.google.android.gms.internal.ads.zzhcz.zza
            com.google.android.gms.internal.ads.zzhao r0 = com.google.android.gms.internal.ads.zzhao.zza
            r1.zzbm(r2, r3, r4, r0)
            return r1
    }

    public BuilderType zzbm(byte[] r9, int r10, int r11, com.google.android.gms.internal.ads.zzhao r12) throws com.google.android.gms.internal.ads.zzhbt {
            r8 = this;
            r8.zzbu()
            com.google.android.gms.internal.ads.zzhcz r0 = com.google.android.gms.internal.ads.zzhcz.zza()     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r1 = r8.zza     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            java.lang.Class r1 = r1.getClass()     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            com.google.android.gms.internal.ads.zzhdk r2 = r0.zzb(r1)     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r3 = r8.zza     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            int r6 = r10 + r11
            com.google.android.gms.internal.ads.zzgzg r7 = new com.google.android.gms.internal.ads.zzgzg     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            r7.<init>(r12)     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            r4 = r9
            r5 = r10
            r2.zzi(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L20 java.lang.IndexOutOfBoundsException -> L29 com.google.android.gms.internal.ads.zzhbt -> L31
            return r8
        L20:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "Reading from byte array should not throw IOException."
            r10.<init>(r11, r9)
            throw r10
        L29:
            com.google.android.gms.internal.ads.zzhbt r9 = new com.google.android.gms.internal.ads.zzhbt
            java.lang.String r10 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r9.<init>(r10)
            throw r9
        L31:
            r9 = move-exception
            throw r9
    }

    public final MessageType zzbn() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zzbo()
            boolean r1 = r0.zzbw()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            com.google.android.gms.internal.ads.zzhdx r0 = com.google.android.gms.internal.ads.zzgza.zzbb(r0)
            throw r0
    }

    public MessageType zzbo() {
            r1 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            boolean r0 = r0.zzcf()
            if (r0 != 0) goto Lb
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            return r0
        Lb:
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            r0.zzbW()
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            return r0
    }

    public MessageType zzbp() {
            r1 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zzb
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhco zzbq() {
            r0 = this;
            r0.zzbg()
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhcp zzbr() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r1.zzbn()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhco
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhcp zzbs() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r1.zzbo()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzhcp zzbt() {
            r1 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r1.zzbp()
            return r0
    }

    protected final void zzbu() {
            r1 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r1.zza
            boolean r0 = r0.zzcf()
            if (r0 != 0) goto Lb
            r1.zzbv()
        Lb:
            return
    }

    protected void zzbv() {
            r2 = this;
            com.google.android.gms.internal.ads.zzhbe r0 = r2.zza()
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r1 = r2.zza
            zzb(r0, r1)
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhcq
    public final boolean zzbw() {
            r2 = this;
            MessageType extends com.google.android.gms.internal.ads.zzhbe<MessageType, BuilderType> r0 = r2.zza
            r1 = 0
            boolean r0 = com.google.android.gms.internal.ads.zzhbe.zzce(r0, r1)
            return r0
    }
}
