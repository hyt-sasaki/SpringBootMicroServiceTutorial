import { HelloApi, HelloDTO } from "../generated/api";

let data: HelloDTO | undefined;

export function useHello() {
  if (data === undefined) {
    throw new HelloApi().v1HelloGet().then((res) => {
      data = res.data;
    });
  }
  return data;
}
