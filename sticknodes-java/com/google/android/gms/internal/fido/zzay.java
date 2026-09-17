package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zzay extends com.google.android.gms.internal.fido.zzau {
    final transient java.lang.Object zza;

    zzay(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.fido.zzav r1 = new com.google.android.gms.internal.fido.zzav
            r1.<init>(r0)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    final int zza(java.lang.Object[] r2, int r3) {
            r1 = this;
            java.lang.Object r3 = r1.zza
            r0 = 0
            r2[r0] = r3
            r2 = 1
            return r2
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq
    public final com.google.android.gms.internal.fido.zzaz zzd() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            com.google.android.gms.internal.fido.zzav r1 = new com.google.android.gms.internal.fido.zzav
            r1.<init>(r0)
            return r1
    }
}
