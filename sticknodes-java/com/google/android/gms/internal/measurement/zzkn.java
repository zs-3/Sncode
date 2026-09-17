package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzkn<MessageType extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zzng {
    public zzkn() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void zza(java.util.List r3, int r4) {
            int r0 = r3.size()
            int r0 = r0 - r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is null."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            int r1 = r3.size()
        L1f:
            int r1 = r1 + (-1)
            if (r1 < r4) goto L27
            r3.remove(r1)
            goto L1f
        L27:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            r3.<init>(r0)
            throw r3
    }

    protected static void zzaW(java.lang.Iterable r4, java.util.List r5) {
            byte[] r0 = com.google.android.gms.internal.measurement.zzmk.zzb
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzmt
            r1 = 0
            if (r0 == 0) goto L72
            com.google.android.gms.internal.measurement.zzmt r4 = (com.google.android.gms.internal.measurement.zzmt) r4
            java.util.List r4 = r4.zza()
            r0 = r5
            com.google.android.gms.internal.measurement.zzmt r0 = (com.google.android.gms.internal.measurement.zzmt) r0
            int r5 = r5.size()
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lda
            java.lang.Object r2 = r4.next()
            if (r2 != 0) goto L54
            int r4 = r0.size()
            int r4 = r4 - r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is null."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            int r1 = r0.size()
        L46:
            int r1 = r1 + (-1)
            if (r1 < r5) goto L4e
            r0.remove(r1)
            goto L46
        L4e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>(r4)
            throw r5
        L54:
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.zzld
            if (r3 == 0) goto L5e
            com.google.android.gms.internal.measurement.zzld r2 = (com.google.android.gms.internal.measurement.zzld) r2
            r0.zzb()
            goto L1b
        L5e:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L6c
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            com.google.android.gms.internal.measurement.zzld.zzj(r2, r1, r3)
            r0.zzb()
            goto L1b
        L6c:
            java.lang.String r2 = (java.lang.String) r2
            r0.add(r2)
            goto L1b
        L72:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzno
            if (r0 != 0) goto Ldb
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto La0
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            boolean r2 = r5 instanceof java.util.ArrayList
            if (r2 == 0) goto L91
            r2 = r5
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r5.size()
            int r3 = r3 + r0
            r2.ensureCapacity(r3)
            goto La0
        L91:
            boolean r2 = r5 instanceof com.google.android.gms.internal.measurement.zznq
            if (r2 == 0) goto La0
            r2 = r5
            com.google.android.gms.internal.measurement.zznq r2 = (com.google.android.gms.internal.measurement.zznq) r2
            int r3 = r5.size()
            int r3 = r3 + r0
            r2.zzf(r3)
        La0:
            int r0 = r5.size()
            boolean r2 = r4 instanceof java.util.List
            if (r2 == 0) goto Lc3
            boolean r2 = r4 instanceof java.util.RandomAccess
            if (r2 == 0) goto Lc3
            java.util.List r4 = (java.util.List) r4
            int r2 = r4.size()
        Lb2:
            if (r1 >= r2) goto Lda
            java.lang.Object r3 = r4.get(r1)
            if (r3 != 0) goto Lbd
            zza(r5, r0)
        Lbd:
            r5.add(r3)
            int r1 = r1 + 1
            goto Lb2
        Lc3:
            java.util.Iterator r4 = r4.iterator()
        Lc7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lda
            java.lang.Object r1 = r4.next()
            if (r1 != 0) goto Ld6
            zza(r5, r0)
        Ld6:
            r5.add(r1)
            goto Lc7
        Lda:
            return
        Ldb:
            java.util.Collection r4 = (java.util.Collection) r4
            r5.addAll(r4)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.measurement.zzkn r0 = r1.zzaR()
            return r0
    }

    public abstract com.google.android.gms.internal.measurement.zzkn zzaR();

    public com.google.android.gms.internal.measurement.zzkn zzaS(byte[] r1, int r2, int r3) throws com.google.android.gms.internal.measurement.zzmm {
            r0 = this;
            r1 = 0
            throw r1
    }

    public com.google.android.gms.internal.measurement.zzkn zzaT(byte[] r1, int r2, int r3, com.google.android.gms.internal.measurement.zzlp r4) throws com.google.android.gms.internal.measurement.zzmm {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzaU(byte[] r3) throws com.google.android.gms.internal.measurement.zzmm {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.measurement.zzkn r3 = r2.zzaS(r3, r1, r0)
            return r3
    }

    @Override // com.google.android.gms.internal.measurement.zzng
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzng zzaV(byte[] r3, com.google.android.gms.internal.measurement.zzlp r4) throws com.google.android.gms.internal.measurement.zzmm {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.measurement.zzkn r3 = r2.zzaT(r3, r1, r0, r4)
            return r3
    }
}
