package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlz;
import com.google.android.gms.internal.measurement.zzmd;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public class zzlz<MessageType extends com.google.android.gms.internal.measurement.zzmd<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzlz<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType> {
    protected com.google.android.gms.internal.measurement.zzmd zza;
    private final com.google.android.gms.internal.measurement.zzmd zzb;

    protected zzlz(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            boolean r0 = r2.zzcw()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.measurement.zzmd r2 = r2.zzcj()
            r1.zza = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Default instance must be immutable."
            r2.<init>(r0)
            throw r2
    }

    private static void zza(java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.measurement.zznp r0 = com.google.android.gms.internal.measurement.zznp.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.measurement.zzns r0 = r0.zzb(r1)
            r0.zzg(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.measurement.zzlz r0 = r1.zzaX()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkn zzaR() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzlz r0 = r1.zzaX()
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkn zzaS(byte[] r2, int r3, int r4) throws com.google.android.gms.internal.measurement.zzmm {
            r1 = this;
            int r3 = com.google.android.gms.internal.measurement.zzlp.zzb
            int r3 = com.google.android.gms.internal.measurement.zznp.zza
            com.google.android.gms.internal.measurement.zzlp r3 = com.google.android.gms.internal.measurement.zzlp.zza
            r0 = 0
            r1.zzaZ(r2, r0, r4, r3)
            return r1
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzkn zzaT(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.zzlp r4) throws com.google.android.gms.internal.measurement.zzmm {
            r0 = this;
            r2 = 0
            r0.zzaZ(r1, r2, r3, r4)
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzlz zzaX() {
            r3 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r3.zzb
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zzl(r1, r2, r2)
            com.google.android.gms.internal.measurement.zzlz r0 = (com.google.android.gms.internal.measurement.zzlz) r0
            com.google.android.gms.internal.measurement.zzmd r1 = r3.zzbb()
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzlz zzaY(com.google.android.gms.internal.measurement.zzmd r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            boolean r0 = r0.zzcw()
            if (r0 != 0) goto L13
            r1.zzbf()
        L13:
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            zza(r0, r2)
        L18:
            return r1
    }

    public final com.google.android.gms.internal.measurement.zzlz zzaZ(byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzlp r11) throws com.google.android.gms.internal.measurement.zzmm {
            r7 = this;
            com.google.android.gms.internal.measurement.zzmd r9 = r7.zza
            boolean r9 = r9.zzcw()
            if (r9 != 0) goto Lb
            r7.zzbf()
        Lb:
            com.google.android.gms.internal.measurement.zznp r9 = com.google.android.gms.internal.measurement.zznp.zza()     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            com.google.android.gms.internal.measurement.zzmd r0 = r7.zza     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            java.lang.Class r0 = r0.getClass()     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            com.google.android.gms.internal.measurement.zzns r1 = r9.zzb(r0)     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            com.google.android.gms.internal.measurement.zzmd r2 = r7.zza     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            r4 = 0
            com.google.android.gms.internal.measurement.zzks r6 = new com.google.android.gms.internal.measurement.zzks     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            r6.<init>(r11)     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            r3 = r8
            r5 = r10
            r1.zzh(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L27 java.lang.IndexOutOfBoundsException -> L30 com.google.android.gms.internal.measurement.zzmm -> L38
            return r7
        L27:
            r8 = move-exception
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Reading from byte array should not throw IOException."
            r9.<init>(r10, r8)
            throw r9
        L30:
            com.google.android.gms.internal.measurement.zzmm r8 = new com.google.android.gms.internal.measurement.zzmm
            java.lang.String r9 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r8.<init>(r9)
            throw r8
        L38:
            r8 = move-exception
            throw r8
    }

    public final MessageType zzba() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zzbb()
            boolean r1 = r0.zzcD()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            com.google.android.gms.internal.measurement.zzod r1 = new com.google.android.gms.internal.measurement.zzod
            r1.<init>(r0)
            throw r1
    }

    public MessageType zzbb() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            boolean r0 = r0.zzcw()
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            return r0
        Lb:
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            r0.zzcr()
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zznh zzbc() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zzbb()
            return r0
    }

    protected final void zzbe() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r1.zza
            boolean r0 = r0.zzcw()
            if (r0 != 0) goto Lb
            r1.zzbf()
        Lb:
            return
    }

    protected void zzbf() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zzb
            com.google.android.gms.internal.measurement.zzmd r0 = r0.zzcj()
            com.google.android.gms.internal.measurement.zzmd r1 = r2.zza
            zza(r0, r1)
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zznh zzcC() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.measurement.zzni
    public final boolean zzcD() {
            r2 = this;
            com.google.android.gms.internal.measurement.zzmd r0 = r2.zza
            r1 = 0
            boolean r0 = com.google.android.gms.internal.measurement.zzmd.zzcv(r0, r1)
            return r0
    }
}
