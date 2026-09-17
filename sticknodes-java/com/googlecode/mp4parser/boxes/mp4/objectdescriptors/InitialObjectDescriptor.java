package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

/* loaded from: classes2.dex */
public abstract class InitialObjectDescriptor extends com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorBase {
    int audioProfileLevelIndication;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> esDescriptors;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor> extensionDescriptors;
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> unknownDescriptors;
    int urlFlag;
    int urlLength;
    java.lang.String urlString;
    int visualProfileLevelIndication;

    public InitialObjectDescriptor() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.esDescriptors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.extensionDescriptors = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.unknownDescriptors = r0
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public void parseDetail(java.nio.ByteBuffer r6) throws java.io.IOException {
            r5 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r6)
            r1 = 65472(0xffc0, float:9.1746E-41)
            r1 = r1 & r0
            int r1 = r1 >> 6
            r5.objectDescriptorId = r1
            r1 = r0 & 63
            int r1 = r1 >> 5
            r5.urlFlag = r1
            r0 = r0 & 31
            int r0 = r0 >> 4
            r5.includeInlineProfileLevelFlag = r0
            int r0 = r5.getSize()
            r1 = 2
            int r0 = r0 - r1
            int r2 = r5.urlFlag
            r3 = -1
            r4 = 1
            if (r2 != r4) goto L35
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.urlLength = r2
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r6, r2)
            r5.urlString = r2
            int r2 = r5.urlLength
            int r2 = r2 + r4
            int r0 = r0 - r2
            goto L71
        L35:
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.oDProfileLevelIndication = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.sceneProfileLevelIndication = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.audioProfileLevelIndication = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.visualProfileLevelIndication = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r6)
            r5.graphicsProfileLevelIndication = r2
            int r0 = r0 + (-5)
            if (r0 <= r1) goto L71
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r2 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r3, r6)
            int r4 = r2.getSize()
            int r0 = r0 - r4
            boolean r4 = r2 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            if (r4 == 0) goto L6c
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> r4 = r5.esDescriptors
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r2 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor) r2
            r4.add(r2)
            goto L71
        L6c:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r4 = r5.unknownDescriptors
            r4.add(r2)
        L71:
            if (r0 <= r1) goto L88
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor r6 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ObjectDescriptorFactory.createFrom(r3, r6)
            boolean r0 = r6 instanceof com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor
            if (r0 == 0) goto L83
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor> r0 = r5.extensionDescriptors
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor r6 = (com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor) r6
            r0.add(r6)
            goto L88
        L83:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r0 = r5.unknownDescriptors
            r0.add(r6)
        L88:
            return
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InitialObjectDescriptor"
            r0.append(r1)
            java.lang.String r1 = "{objectDescriptorId="
            r0.append(r1)
            int r1 = r2.objectDescriptorId
            r0.append(r1)
            java.lang.String r1 = ", urlFlag="
            r0.append(r1)
            int r1 = r2.urlFlag
            r0.append(r1)
            java.lang.String r1 = ", includeInlineProfileLevelFlag="
            r0.append(r1)
            int r1 = r2.includeInlineProfileLevelFlag
            r0.append(r1)
            java.lang.String r1 = ", urlLength="
            r0.append(r1)
            int r1 = r2.urlLength
            r0.append(r1)
            java.lang.String r1 = ", urlString='"
            r0.append(r1)
            java.lang.String r1 = r2.urlString
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", oDProfileLevelIndication="
            r0.append(r1)
            int r1 = r2.oDProfileLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", sceneProfileLevelIndication="
            r0.append(r1)
            int r1 = r2.sceneProfileLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", audioProfileLevelIndication="
            r0.append(r1)
            int r1 = r2.audioProfileLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", visualProfileLevelIndication="
            r0.append(r1)
            int r1 = r2.visualProfileLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", graphicsProfileLevelIndication="
            r0.append(r1)
            int r1 = r2.graphicsProfileLevelIndication
            r0.append(r1)
            java.lang.String r1 = ", esDescriptors="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> r1 = r2.esDescriptors
            r0.append(r1)
            java.lang.String r1 = ", extensionDescriptors="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ExtensionDescriptor> r1 = r2.extensionDescriptors
            r0.append(r1)
            java.lang.String r1 = ", unknownDescriptors="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor> r1 = r2.unknownDescriptors
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
