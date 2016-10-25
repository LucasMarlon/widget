package com.ionicframework.widgetexample362010;

public class ListWidgetProvider extends run.ace.AppWidgetProvider {
	@Override protected int getLayoutResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("list_widget_layout", "layout", context);
	}

	@Override protected int getViewResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("list_widget_view", "id", context);
	}

	@Override protected int getItemResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("list_widget_item", "id", context);
	}

	@Override protected int getItemTextRoomResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("tv_room", "id", context);
	}

	@Override protected int getItemTextDateResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("tv_date", "id", context);
	}	

	@Override protected int getItemTextScheduleResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("tv_schedule", "id", context);
	}

	@Override protected int getItemImageRoomResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("iv_room", "id", context);
	}

	@Override protected int getItemLayoutResourceId(android.content.Context context) {
		return run.ace.NativeHost.getResourceId("list_widget_item", "layout", context);
	}
}