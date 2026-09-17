package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticatorSelectionCriteriaCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAttachmentAsString", id = 2, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.Attachment zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequireResidentKey", id = 3)
    private final java.lang.Boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequireUserVerificationAsString", id = 4, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.zzay zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResidentKeyRequirementAsString", id = 5, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder {
        private com.google.android.gms.fido.fido2.api.common.Attachment zza;
        private java.lang.Boolean zzb;
        private com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzc;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria build() {
                r5 = this;
                com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r0 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria
                com.google.android.gms.fido.fido2.api.common.Attachment r1 = r5.zza
                r2 = 0
                if (r1 != 0) goto L9
                r1 = r2
                goto Ld
            L9:
                java.lang.String r1 = r1.toString()
            Ld:
                java.lang.Boolean r3 = r5.zzb
                com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r4 = r5.zzc
                if (r4 != 0) goto L15
                r4 = r2
                goto L19
            L15:
                java.lang.String r4 = r4.toString()
            L19:
                r0.<init>(r1, r3, r2, r4)
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setAttachment(com.google.android.gms.fido.fido2.api.common.Attachment r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setRequireResidentKey(java.lang.Boolean r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setResidentKeyRequirement(com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzm r0 = new com.google.android.gms.fido.fido2.api.common.zzm
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthenticatorSelectionCriteria(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 != 0) goto L8
            r2 = r0
            goto Lc
        L8:
            com.google.android.gms.fido.fido2.api.common.Attachment r2 = com.google.android.gms.fido.fido2.api.common.Attachment.fromString(r2)     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
        Lc:
            r1.zza = r2     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
            r1.zzb = r3     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
            if (r4 != 0) goto L14
            r2 = r0
            goto L18
        L14:
            com.google.android.gms.fido.fido2.api.common.zzay r2 = com.google.android.gms.fido.fido2.api.common.zzay.zza(r4)     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
        L18:
            r1.zzc = r2     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
            if (r5 != 0) goto L1d
            goto L21
        L1d:
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r0 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(r5)     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
        L21:
            r1.zzd = r0     // Catch: com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException -> L24 com.google.android.gms.fido.fido2.api.common.zzax -> L26 com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException -> L28
            return
        L24:
            r2 = move-exception
            goto L29
        L26:
            r2 = move-exception
            goto L29
        L28:
            r2 = move-exception
        L29:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r4 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) r4
            com.google.android.gms.fido.fido2.api.common.Attachment r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.Attachment r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            java.lang.Boolean r0 = r3.zzb
            java.lang.Boolean r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            com.google.android.gms.fido.fido2.api.common.zzay r0 = r3.zzc
            com.google.android.gms.fido.fido2.api.common.zzay r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r0 = r3.zzd
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r4 = r4.zzd
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L32
            r4 = 1
            return r4
        L32:
            return r1
    }

    public com.google.android.gms.fido.fido2.api.common.Attachment getAttachment() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.Attachment r0 = r1.zza
            return r0
    }

    public java.lang.String getAttachmentAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.Attachment r0 = r1.zza
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Boolean getRequireResidentKey() {
            r1 = this;
            java.lang.Boolean r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement getResidentKeyRequirement() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r0 = r1.zzd
            return r0
    }

    public java.lang.String getResidentKeyRequirementAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r0 = r1.zzd
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.Attachment r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.Boolean r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzay r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getAttachmentAsString()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.Boolean r0 = r3.getRequireResidentKey()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(r4, r1, r0, r2)
            com.google.android.gms.fido.fido2.api.common.zzay r0 = r3.zzc
            if (r0 != 0) goto L1b
            r0 = 0
            goto L1f
        L1b:
            java.lang.String r0 = r0.toString()
        L1f:
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            r0 = 5
            java.lang.String r1 = r3.getResidentKeyRequirementAsString()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r0, r1, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
