package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CableAuthenticationExtensionCreator")
/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCableAuthentication", id = 1)
    private final java.util.List zza;

    static {
            com.google.android.gms.fido.fido2.api.common.zzt r0 = new com.google.android.gms.fido.fido2.api.common.zzt
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.util.List r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.util.List r1 = (java.util.List) r1
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.zzs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.zzs r4 = (com.google.android.gms.fido.fido2.api.common.zzs) r4
            java.util.List r0 = r3.zza
            java.util.List r2 = r4.zza
            boolean r0 = r0.containsAll(r2)
            if (r0 == 0) goto L1e
            java.util.List r4 = r4.zza
            java.util.List r0 = r3.zza
            boolean r4 = r4.containsAll(r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r2 = r3.zza
            r1.<init>(r2)
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.util.List r0 = r3.zza
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
