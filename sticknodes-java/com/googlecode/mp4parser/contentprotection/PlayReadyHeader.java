package com.googlecode.mp4parser.contentprotection;

/* loaded from: classes2.dex */
public class PlayReadyHeader extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader {
    public static java.util.UUID PROTECTION_SYSTEM_ID;
    private long length;
    private java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord> records;

    public static abstract class PlayReadyRecord {
        int type;

        public static class DefaulPlayReadyRecord extends com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord {
            java.nio.ByteBuffer value;

            public DefaulPlayReadyRecord(int r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public java.nio.ByteBuffer getValue() {
                    r1 = this;
                    java.nio.ByteBuffer r0 = r1.value
                    return r0
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(java.nio.ByteBuffer r1) {
                    r0 = this;
                    java.nio.ByteBuffer r1 = r1.duplicate()
                    r0.value = r1
                    return
            }
        }

        public static class EmeddedLicenseStore extends com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord {
            java.nio.ByteBuffer value;

            public EmeddedLicenseStore() {
                    r1 = this;
                    r0 = 3
                    r1.<init>(r0)
                    return
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public java.nio.ByteBuffer getValue() {
                    r1 = this;
                    java.nio.ByteBuffer r0 = r1.value
                    return r0
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(java.nio.ByteBuffer r1) {
                    r0 = this;
                    java.nio.ByteBuffer r1 = r1.duplicate()
                    r0.value = r1
                    return
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "EmeddedLicenseStore"
                    r0.append(r1)
                    java.lang.String r1 = "{length="
                    r0.append(r1)
                    java.nio.ByteBuffer r1 = r2.getValue()
                    int r1 = r1.limit()
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public static class RMHeader extends com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord {
            java.lang.String header;

            public RMHeader() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            public java.lang.String getHeader() {
                    r1 = this;
                    java.lang.String r0 = r1.header
                    return r0
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public java.nio.ByteBuffer getValue() {
                    r2 = this;
                    java.lang.String r0 = r2.header     // Catch: java.io.UnsupportedEncodingException -> Ld
                    java.lang.String r1 = "UTF-16LE"
                    byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> Ld
                    java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
                    return r0
                Ld:
                    r0 = move-exception
                    java.lang.RuntimeException r1 = new java.lang.RuntimeException
                    r1.<init>(r0)
                    throw r1
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public void parse(java.nio.ByteBuffer r3) {
                    r2 = this;
                    java.nio.ByteBuffer r0 = r3.slice()     // Catch: java.io.UnsupportedEncodingException -> L17
                    int r0 = r0.limit()     // Catch: java.io.UnsupportedEncodingException -> L17
                    byte[] r0 = new byte[r0]     // Catch: java.io.UnsupportedEncodingException -> L17
                    r3.get(r0)     // Catch: java.io.UnsupportedEncodingException -> L17
                    java.lang.String r3 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L17
                    java.lang.String r1 = "UTF-16LE"
                    r3.<init>(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L17
                    r2.header = r3     // Catch: java.io.UnsupportedEncodingException -> L17
                    return
                L17:
                    r3 = move-exception
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    r0.<init>(r3)
                    throw r0
            }

            public void setHeader(java.lang.String r1) {
                    r0 = this;
                    r0.header = r1
                    return
            }

            @Override // com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord
            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "RMHeader"
                    r0.append(r1)
                    java.lang.String r1 = "{length="
                    r0.append(r1)
                    java.nio.ByteBuffer r1 = r2.getValue()
                    int r1 = r1.limit()
                    r0.append(r1)
                    java.lang.String r1 = ", header='"
                    r0.append(r1)
                    java.lang.String r1 = r2.header
                    r0.append(r1)
                    r1 = 39
                    r0.append(r1)
                    r1 = 125(0x7d, float:1.75E-43)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        public PlayReadyRecord(int r1) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                return
        }

        public static java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord> createFor(java.nio.ByteBuffer r5, int r6) {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
                r1 = 0
            L6:
                if (r1 < r6) goto L9
                return r0
            L9:
                int r2 = com.coremedia.iso.IsoTypeReader.readUInt16BE(r5)
                int r3 = com.coremedia.iso.IsoTypeReader.readUInt16BE(r5)
                r4 = 1
                if (r2 == r4) goto L2d
                r4 = 2
                if (r2 == r4) goto L26
                r4 = 3
                if (r2 == r4) goto L20
                com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord r4 = new com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord
                r4.<init>(r2)
                goto L32
            L20:
                com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$EmeddedLicenseStore r4 = new com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$EmeddedLicenseStore
                r4.<init>()
                goto L32
            L26:
                com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord r2 = new com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord
                r2.<init>(r4)
                r4 = r2
                goto L32
            L2d:
                com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$RMHeader r4 = new com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord$RMHeader
                r4.<init>()
            L32:
                java.nio.ByteBuffer r2 = r5.slice()
                java.nio.Buffer r2 = r2.limit(r3)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                r4.parse(r2)
                int r2 = r5.position()
                int r2 = r2 + r3
                r5.position(r2)
                r0.add(r4)
                int r1 = r1 + 1
                goto L6
        }

        public abstract java.nio.ByteBuffer getValue();

        public abstract void parse(java.nio.ByteBuffer r1);

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PlayReadyRecord"
                r0.append(r1)
                java.lang.String r1 = "{type="
                r0.append(r1)
                int r1 = r2.type
                r0.append(r1)
                java.lang.String r1 = ", length="
                r0.append(r1)
                java.nio.ByteBuffer r1 = r2.getValue()
                int r1 = r1.limit()
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.String r0 = "9A04F079-9840-4286-AB92-E65BE0885F95"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PROTECTION_SYSTEM_ID = r0
            java.util.Map<java.util.UUID, java.lang.Class<? extends com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader>> r1 = com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader.uuidRegistry
            java.lang.Class<com.googlecode.mp4parser.contentprotection.PlayReadyHeader> r2 = com.googlecode.mp4parser.contentprotection.PlayReadyHeader.class
            r1.put(r0, r2)
            return
    }

    public PlayReadyHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public java.nio.ByteBuffer getData() {
            r4 = this;
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r0 = r4.records
            java.util.Iterator r0 = r0.iterator()
            r1 = 6
        L7:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L49
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            long r0 = (long) r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32BE(r2, r0)
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r0 = r4.records
            int r0 = r0.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16BE(r2, r0)
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r0 = r4.records
            java.util.Iterator r3 = r0.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L2b
            return r2
        L2b:
            java.lang.Object r0 = r3.next()
            com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord r0 = (com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord) r0
            int r1 = r0.type
            com.coremedia.iso.IsoTypeWriter.writeUInt16BE(r2, r1)
            java.nio.ByteBuffer r1 = r0.getValue()
            int r1 = r1.limit()
            com.coremedia.iso.IsoTypeWriter.writeUInt16BE(r2, r1)
            java.nio.ByteBuffer r0 = r0.getValue()
            r2.put(r0)
            goto L24
        L49:
            java.lang.Object r2 = r0.next()
            com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord r2 = (com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord) r2
            int r1 = r1 + 4
            java.nio.ByteBuffer r2 = r2.getValue()
            java.nio.Buffer r2 = r2.rewind()
            int r2 = r2.limit()
            int r1 = r1 + r2
            goto L7
    }

    public java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord> getRecords() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r0 = r1.records
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public java.util.UUID getSystemId() {
            r1 = this;
            java.util.UUID r0 = com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PROTECTION_SYSTEM_ID
            return r0
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32BE(r3)
            r2.length = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16BE(r3)
            java.util.List r3 = com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord.createFor(r3, r0)
            r2.records = r3
            return
    }

    public void setRecords(java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader.PlayReadyRecord> r1) {
            r0 = this;
            r0.records = r1
            return
    }

    @Override // com.googlecode.mp4parser.boxes.piff.ProtectionSpecificHeader
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PlayReadyHeader"
            r0.append(r1)
            java.lang.String r1 = "{length="
            r0.append(r1)
            long r1 = r3.length
            r0.append(r1)
            java.lang.String r1 = ", recordCount="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r1 = r3.records
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", records="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.contentprotection.PlayReadyHeader$PlayReadyRecord> r1 = r3.records
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
