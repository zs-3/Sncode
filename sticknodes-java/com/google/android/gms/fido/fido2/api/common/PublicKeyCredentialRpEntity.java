package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialRpEntityCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 2)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getName", id = 3)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIcon", id = 4)
    private final java.lang.String zzc;

    static {
            com.google.android.gms.fido.fido2.api.common.zzap r0 = new com.google.android.gms.fido.fido2.api.common.zzap
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PublicKeyCredentialRpEntity(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzb = r1
            r0.zzc = r3
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r4 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r4
            java.lang.String r0 = r3.zza
            java.lang.String r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = r3.zzc
            java.lang.String r4 = r4.zzc
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public java.lang.String getIcon() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getId()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getName()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getIcon()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
