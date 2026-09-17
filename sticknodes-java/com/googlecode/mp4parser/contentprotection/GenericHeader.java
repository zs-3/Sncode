package com.googlecode.mp4parser.contentprotection;

/* loaded from: classes2.dex */
public class GenericHeader extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader {
    public static java.util.UUID PROTECTION_SYSTEM_ID;
    java.nio.ByteBuffer data;

    static {
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            com.googlecode.mp4parser.contentprotection.GenericHeader.PROTECTION_SYSTEM_ID = r0
            java.util.Map<java.util.UUID, java.lang.Class<? extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader>> r1 = com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader.uuidRegistry
            java.lang.Class<com.googlecode.mp4parser.contentprotection.GenericHeader> r2 = com.googlecode.mp4parser.contentprotection.GenericHeader.class
            r1.put(r0, r2)
            return
    }

    public GenericHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public java.util.UUID getSystemId() {
            r1 = this;
            java.util.UUID r0 = com.googlecode.mp4parser.contentprotection.GenericHeader.PROTECTION_SYSTEM_ID
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.data = r1
            return
    }
}
