// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

package io.grpc.examples.data;

public final class DataProto {
  private DataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_UsersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_UsersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_data_UsersReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_data_UsersReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ndata.proto\022\004data\"\034\n\014UsersRequest\022\014\n\004na" +
      "me\030\001 \001(\t\"\035\n\nUsersReply\022\017\n\007message\030\001 \001(\t2" +
      "x\n\005Users\0223\n\tListNames\022\022.data.UsersReques" +
      "t\032\020.data.UsersReply\"\000\022:\n\020ListAvailDriver" +
      "s\022\022.data.UsersRequest\032\020.data.UsersReply\"" +
      "\000B(\n\025io.grpc.examples.dataB\tDataProtoP\001\242" +
      "\002\001Db\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_data_UsersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_data_UsersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_UsersRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_data_UsersReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_data_UsersReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_data_UsersReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
